import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt();
		int h = sc.nextInt(), w = sc.nextInt();
		int a = H-h, b = W-w;
		System.out.println(a*b);
	}

}