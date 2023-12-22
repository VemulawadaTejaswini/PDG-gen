import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		for(int i=0;i<n;i++) count += in.nextInt() % 2 == 0 ? 0 : 1;
		System.out.println(count % 2 == 0 ? "YES" : "NO");
	}
}
