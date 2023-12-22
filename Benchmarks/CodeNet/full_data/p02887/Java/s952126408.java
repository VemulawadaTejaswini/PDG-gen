import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String s=sc.next();
		int ans=1;
		char last=s.charAt(0);
		for(int i=1; i<N; i++) {
			if(last==s.charAt(i)) {
				//none
			}
			else {
				last=s.charAt(i);
				ans++;
			}
		}
		p(ans);
	}
	public static void p(Object o) {
		System.out.println(o);
	}
}