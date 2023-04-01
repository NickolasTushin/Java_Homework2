import java.io.FileWriter;
import java.io.IOException;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2, 56, 67, 21, 1 };
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        String log = "";

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            log += arrayToString(arr) + "\n";

        } while (swapped);

        try {
            FileWriter writer = new FileWriter("log.txt");
            writer.write(log);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Массив отсортирован :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static String arrayToString(int[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        }
        return str.trim();
    }
}