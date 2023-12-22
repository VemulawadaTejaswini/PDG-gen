

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
//        char[] arr = sc.next().toCharArray();
//        int count = 0;
//        int blackCount = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 'B') {
//                blackCount++;
//            } else {
//                count += blackCount;
//            }
//        }
//        System.out.println(count);
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int b = 0;
        long ans = 0;
        for (char c : s) {
            if (c == 'B') {
                b++;
            } else {
                ans += b;
            }
        }
        System.out.println(ans);
    }
}
