import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[][] x = new char[3][];

		x[0] = sc.next().toCharArray();
		x[1] = sc.next().toCharArray();
		x[2] = sc.next().toCharArray();

		int e = 0;
		int d = 0;
		int a = 0;
		int b = -1;
		int c = -1;

		for (int i = 0;; i++){
			if(d == 0 && a == x[0].length) break;
			if(d == 1 && b == x[1].length) break;
			if(d == 2 && c == x[2].length) break;

			if (x[d][e] == 'a') { d = 0; a++; e = a; continue;}
			if (x[d][e] == 'b') { d = 1; b++; e = b; continue;}
			if (x[d][e] == 'c') { d = 2; c++; e = c; continue;}
		}

		if (d == 0) System.out.println("A");
		if (d == 1) System.out.println("B");
		if (d == 2) System.out.println("C");


		sc.close();
	}

}
