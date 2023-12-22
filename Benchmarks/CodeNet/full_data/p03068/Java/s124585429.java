import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        String str = kbd.next();
        String[] strArr = str.split("");
        int k = kbd.nextInt();
        k = k - 1;
        printArr(strArr, k);
    }

    static void printArr(String[] arr, int n) {
        String s = arr[n];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s)) {
                System.out.print(s);
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}