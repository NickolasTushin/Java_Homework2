import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task3Dop {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Выберите действие (+, -, *, /): ");
        String operator = scanner.next();
        double result = 0.0;
        
        switch(operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: неверная операция!");
                return;
        }
        
        System.out.println("Результат: " + result);
        
        // Логирование
        try {
            File logFile = new File("log.txt");
            if(!logFile.exists()) {
                logFile.createNewFile();
            }
            FileWriter writer = new FileWriter(logFile, true);
            writer.write("Операция: " + num1 + " " + operator + " " + num2 + " = " + result + "\n");
            writer.close();
        } catch(IOException e) {
          
        }
    }
}
