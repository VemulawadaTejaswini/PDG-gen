package atcoder.beginner;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("age value>");
        String[] input = scanner.nextLine().split(" ");
        int age = Integer.valueOf(input[0]);
        int value = Integer.valueOf(input[1]);
        int cost = value;

        if (age <= 5) {
            cost = 0;
        } else if ( age >= 6 && age <= 12) {
            cost = value / 2;
        }

        System.out.println(cost);

    }
}
