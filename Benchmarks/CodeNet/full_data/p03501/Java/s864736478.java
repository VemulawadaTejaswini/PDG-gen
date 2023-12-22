import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		int n,a,b;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		if(n * a < b)	System.out.println(n * a);
		else System.out.println(b);
	}
}
