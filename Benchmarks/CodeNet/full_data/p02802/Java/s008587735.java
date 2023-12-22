import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=0;
		int d=0;
		boolean[] f=new boolean[n];
		int x[]=new int[n];
		for(int i=0;i<n;i++)
			x[i]=0;
		for(int i=0;i<m;i++) {
			int p=sc.nextInt();
			String s=sc.next();
			if(!(f[p-1])&&s.equals("AC")) {
				f[p-1]=true;
				c++;
				d+=x[p-1];
			}
			if(!(f[p-1])&&s.equals("WA")) {
				x[p-1]++;
			}
		}
		System.out.println(c+" "+d);


	}

}
