

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long H = sc.nextInt();
        long W = sc.nextInt();
        long K = (H*W / 2) + (H*W % 2);

        System.out.println(K);

    }
}