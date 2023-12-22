import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int length = str.length(),r=0,g=0,b=0;
		char[] rgb = str.toCharArray();
		for(int i=0;i<length;i++) {
			if(rgb[i]=='R') r++;
			if(rgb[i]=='G') g++;
			if(rgb[i]=='B') b++;
		}
		int ans = r*g*b;
		int len,count=0;
		if(length%2==0) len=length/2-1;
		else len = length/2;
		for(int i=1;i<len;i++) {
			for(int j=0;j<=length-2*i;j++) {
				if(rgb[j]!=rgb[j+i] && rgb[j]!=rgb[j+2*i] && rgb[j+i]!=rgb[j+2*i]) {
					count++;
				}
			}
		}
		System.out.println(ans-count);
	}
}