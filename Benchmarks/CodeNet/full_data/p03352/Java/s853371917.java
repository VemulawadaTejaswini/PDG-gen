package rensyu;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int heiho = (int) Math.floor(Math.sqrt(a));
        System.out.println(heiho * heiho);
        sc.close();
	}
}
