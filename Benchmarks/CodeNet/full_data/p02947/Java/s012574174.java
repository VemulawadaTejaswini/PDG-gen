import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char list[][] = new char[n][10];
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextLine().toCharArray();
            Arrays.sort(list[i]);
        }
        scanner.close();

        int c = 0;
        for (int i = 0; i < list.length; i++) {
            c += getDupCount(list, i);
        }
        
        System.out.println(c);
    }

    private static int getDupCount(char[][] data, int index) {
        int c = 0;
        outside: for (int i = index + 1; i < data.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (data[index][j] != data[i][j]) continue outside;
            }
            c++;
        }
        return c;
    }
}