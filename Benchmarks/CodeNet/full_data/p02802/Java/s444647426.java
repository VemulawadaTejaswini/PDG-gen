import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=0;
		int d=0;
		boolean[] f=new boolean[n];
		for(int i=0;i<m;i++) {
			int p=sc.nextInt();
			String s=sc.next();
			if(!(f[p-1])&&s.equals("AC")) {
				f[p-1]=true;
				c++;
			}
			if(!(f[p-1])&&s.equals("WA")) {
				d++;
			}
		}
		System.out.println(c+" "+d);


	}

}
