import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		sc.close();

		System.out.println(x<1200 ? "ABC" : "ARC");
	}
}
