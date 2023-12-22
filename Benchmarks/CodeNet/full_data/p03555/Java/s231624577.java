import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String[] al = a.split("");
		String[] bl = b.split("");
		if ((al[0].equals(bl[2])) && (bl[0].equals(al[2])) && (al[1].equals(bl[1]))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}


	}}