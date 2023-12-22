import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		String str = sc.next();
		char[] c = str.toCharArray();
		if(c[0]=='1') count++;
		if(c[1]=='1')count++;
		if(c[2]=='1')count++;
		System.out.printf("%d\n",count);
	}
}
