import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	public static void main(String[] args) {
		//int N=sc.nextInt();
		int a[][]=new int[3][3];
		
		for(int i1=0;i1<3;i1++) {
			for(int i2=0;i2<3;i2++) {
				a[i1][i2]=sc.nextInt();
			}
		}
		int N=sc.nextInt();
		int b[]=new int[N];
		for(int i=0;i<N;i++) {
			b[i]=sc.nextInt();
		}
		
		for(int i1=0;i1<3;i1++) {
			for(int i2=0;i2<3;i2++) {
				for(int k=0;k<N;k++) {
					if(a[i1][i2]==b[k]) {
						a[i1][i2]=0;
					}
				}
			}
		}
		int ctn=0;
		for(int i1=0;i1<3;i1++) {
			if(a[i1][0]==a[i1][1]&&a[i1][1]==a[i1][2]) {
				ctn++;
				break;
			}
		}
		for(int i1=0;i1<3;i1++) {
			if(a[0][i1]==a[1][i1]&&a[1][i1]==a[2][i1]) {
				ctn++;
				break;
			}
		}
		if(a[0][0]==a[1][1]&&a[2][2]==a[1][1]) {
			ctn++;}else if(a[0][2]==a[1][1]&&a[1][1]==a[2][0]) {
				ctn++;
			}
		System.out.println(ctn > 0 ? "Yes" : "No");
	}
	
}