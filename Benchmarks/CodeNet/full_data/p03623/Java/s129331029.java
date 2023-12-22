import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int distA = Math.abs(a-x);
		int distB = Math.abs(b-x);

		System.out.println(distA < distB ? "A" : "B");
	}
}
