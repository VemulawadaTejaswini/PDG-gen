import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] o = sc.next().toCharArray();
		char[] e = sc.next().toCharArray();
		int i;
		char[] pass = new char[o.length + e.length];
		for(i = 0; i < pass.length / 2; i++) {
			pass[i * 2] = o[i];
			pass[i * 2 + 1] = e[i];
		}
		if(o.length - e.length == 1) pass[i * 2] = o[i];
		System.out.println(pass);
	}
}