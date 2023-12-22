import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String i1 = sc.next(),i2=sc.next();
		char[] s=i1.toCharArray();
		char[] t=i2.toCharArray();

		java.util.Arrays.sort(s);
		Arrays.sort(t);
		char[] t2= new char[t.length];
		int cnt=0;
		for(int i=t.length-1; 0<=i;i--) {
			t2[cnt]=t[i];
			cnt++;
		}

//		for(char c: t2) {
//			System.out.print(c);
//		}

		int mini=Math.min(s.length, t2.length);
		int n=0;
		for(int i=0; i<mini;i++) {
			if(s[i]<t2[i]) {
				System.out.println("Yes");
				return;
			}else if(s.length<t2.length && s[i]==t2[i]) {
				n++;
			}

			if(n==mini) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}