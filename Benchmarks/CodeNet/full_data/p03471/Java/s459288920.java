import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N,Y;
		N=sc.nextInt();
		Y=sc.nextInt();
		int A=-1,B=-1,C=-1;
		boolean flag=false;
		for(int a=0;a<=N;a++) {
			for(int b=0;b<=N-a;b++) {
				int c=N-a-b;
				int total=a*10000+b*5000+c*1000;
				if(total==Y) {
					A=a;
					B=b;
					C=c;
					flag=true;
				
				}
				
			}
			
			
		}
			
		System.out.println(A+" "+B+" "+C);
		
	}

}
