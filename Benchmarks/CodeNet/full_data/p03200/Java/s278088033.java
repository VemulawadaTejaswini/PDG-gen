

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        char[] arr = sc.next().toCharArray();
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= i; j--) {
                if (arr[j - 1] == 'B' && arr[j] == 'W') {
                    char tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
