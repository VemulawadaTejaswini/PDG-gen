import java.util.Scanner;

public class Main {
	private static void p(String s) {System.out.println(s);}
	static Scanner sc = new Scanner(System.in);
	static int a,b,c,n,m;

	//<--main------------------------------------------------>
	public static void main(String[] args) {
	char c[]=sc.next().toCharArray();
	char last='0';
	int ans1=0;
	for(int i=0;i<c.length;i++) {
		if(c[i]==last) {
			if(last=='0') {
				last='1';
				ans1++;
			}else {
				last='0';
				ans1++;
			}
		}else {
			if(last=='0') {
				last='1';
			}else {
				last='0';
			}
		}
		}
	char last2='1';
	int ans2=0;
	for(int i=0;i<c.length;i++) {
		if(c[i]==last2) {
			if(last2=='0') {
				last2='1';
				ans2++;
			}else {
				last2='0';
				ans2++;
			}
		}else {
			if(last2=='0') {
				last2='1';
			}else {
				last2='0';
			}
		}
		}
	int ans=Math.min(ans1, ans2);
	p(""+ans);
	}

}
