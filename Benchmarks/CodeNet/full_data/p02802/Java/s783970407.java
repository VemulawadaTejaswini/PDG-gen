import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] x=new int[n+1];
		int[] y=new int[n+1];
		int sum=0,num=0;
		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			String s=sc.next();
			if(y[a]==-1)
				continue;
			if(s.equals("AC")) {
				x[a]=1;
				num+=y[a];
				y[a]=-1;
			}else {
				y[a]++;
			}
		}
		for(int i=0;i<n+1;i++) {
			if(x[i]>0)
				sum++;
		}
		System.out.print(sum+" "+num);
	}
} 