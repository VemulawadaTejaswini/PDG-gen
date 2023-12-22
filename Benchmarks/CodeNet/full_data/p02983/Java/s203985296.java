

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner std = new Scanner(System.in);

		long L = std.nextLong();
		long R = std.nextLong();

		long a = 0;
		long amari = 0;
		long amaritemp = 2018;
		while(true) {
			amari = R*L%2019;
			if(amari == 0) {
				break;
			}
			R-=1;
			if(L+1 == R) {
				break;
			}


			if(amaritemp >= amari) {
				amaritemp = amari;
			}

		}

		System.out.println(amaritemp);









	}




}
