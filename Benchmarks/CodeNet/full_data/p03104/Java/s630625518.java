import java.util.*;
import java.io.*;
public class Main{
	static long A(long a) {
		long lol1 = a/4;
		long lol2 = 0;
		for(long w = 4*lol1; w<=a; w++) {
			lol2 ^= w;
		}
		return lol2;
	}
public static void main(String[]args) throws IOException{
	Scanner sc =new Scanner(System.in);
	long A1 = sc.nextLong();
	long A2 = sc.nextLong();
	System.out.println(A(A2) ^ A(A1-1));
}
}