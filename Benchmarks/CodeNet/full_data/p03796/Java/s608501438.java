package problems.abc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        sc.close();
        Long pow = 1L;

        for(Long i = 1L; i <= n; i++){
            pow = i * pow % ((int)Math.pow(10L, 9L) +7L);
        }

        System.out.println(pow);
    }

}