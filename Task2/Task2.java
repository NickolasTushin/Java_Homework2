import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        try {
            File file = new File("students.txt");
            Scanner scanner = new Scanner(file);
            StringBuilder result = new StringBuilder();
            
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String surname = parts[0].split(":")[1].replace("\"", "");
                String grade = parts[1].split(":")[1].replace("\"", "");
                String subject = parts[2].split(":")[1].replace("\"", "");
                result.append("Студент ").append(surname).append(" получил ").append(grade).append(" по предмету ").append(subject).append(". ");
            }
            
            System.out.println(result.toString());
            
        } catch(FileNotFoundException e) {
            
        }
    }
}