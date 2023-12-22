import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n+1];
		long sum=0;
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		if(sum%((n*(n+1))/2)!=0)System.out.println("NO");
		else{
			long p=sum/((n*(n+1))/2);
			long q=0;
			a[n]=a[0];
			for (int i = 0; i < n; i++) {
				int b=a[i]-a[i+1];
				if((b+p)%n!=0){
					System.out.println("NO");
					return;
				}
				else{
					q+=(b+p)/n;
				}
			}
			if(p==q)System.out.println("YES");
			else System.out.println("NO");
			
			
		}
		
		}
		
	}