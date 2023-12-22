import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String str = sc.next();
		long r=0,g=0,b=0;
		char[] rgb = str.toCharArray();
		for(int i=0;i<length;i++) {
			if(rgb[i]=='R') r++;
			if(rgb[i]=='G') g++;
			if(rgb[i]=='B') b++;
		}
		long ans = r*g*b;
		for(int i=1;i<=length;i++) {
			for(int j=0;2*i+j<length;j++) {
				if(rgb[j]!=rgb[j+i] && rgb[j]!=rgb[j+2*i] && rgb[j+i]!=rgb[j+2*i]) ans--;
			}
		}
		System.out.println(ans);
	}
}