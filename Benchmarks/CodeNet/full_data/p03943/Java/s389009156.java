import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		boolean ok = false;
		if(a[0] + a[1] == a[2]) ok = true;
		System.out.println((ok)?"Yes":"No");
	}
}