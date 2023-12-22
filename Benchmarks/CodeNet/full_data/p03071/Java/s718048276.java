//package abc124.a;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max1 = Math.max(a, b);
        int min1 = Math.min(a, b);
        int max2 = Math.max(max1 - 1, min1);
        System.out.println(max1 + max2);
        sc.close();
    }
}