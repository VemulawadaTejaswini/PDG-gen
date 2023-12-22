import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		String s = sc.next();
		String t = sc.next();
		String[] sa = s.split("");
		String[] ta = t.split("");
		int count  =0;

		if(sa[0].equals(ta[0])){
			count++;
		}
		if(sa[1].equals(ta[1])){
			count++;
		}		
		if(sa[2].equals(ta[2])){
			count++;
		}

		System.out.println(count);

	}
}
