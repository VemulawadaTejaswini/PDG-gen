package abc.practice;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 1;
        int i = 0;
        while (b > count) {
            count--;
            count += a;
            i++;
        }
        System.out.println(i);
    }
}
