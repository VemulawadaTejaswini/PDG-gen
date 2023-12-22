import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long L = input.nextLong();
		long R = input.nextLong();
		long mod = 2019;
		L%=mod;
		R%=mod;
		System.out.println(L*(L+1));
	}
}