package ProblemSolve;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int n, sum = 0;

        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        if (n >= 1 && n <= 100) {

            for (int i = 1; i <= n; i++) {

                sum = sum + i;
            }

            System.out.println(sum);
        }

    }

  }
