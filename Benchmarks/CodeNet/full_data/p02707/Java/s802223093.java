import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[2];
        for(int i = 0;i < arr.length;i++) {
            arr[i] = scanner.nextLine();
        }

        int n = Integer.parseInt(arr[0]);

        String[] line2 = arr[1].split(" ");

        int[] a = new int[line2.length];
        for (int i = 0; i < line2.length; i++) {
            a[i] = Integer.parseInt(line2[i]);
        }

        int[] answers = new int[n];
        for (int id : a) {
            answers[id - 1] ++;
        }

        for (int answer : answers) {
            System.out.println(answer);
        }

        scanner.close();
    }
}
