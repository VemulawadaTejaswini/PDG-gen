import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long koumoku = B - A + 1;

//		long kosu = koumoku - (koumoku / C) - (koumoku / D) + (koumoku / (C * D));
		long kosu = koumoku - kosu(A, B, C) - kosu(A, B, D) + kosu(A, B, C * D);
		System.out.println(kosu);
	}

	public static long kosu(long min, long max, long wari){

		long start = min + min % wari;

		long mod = (max - start) % wari;
		long kosu = (max - start) / wari;
		if (mod > 0){
			kosu += 1;
		}

		return kosu;
	}
}