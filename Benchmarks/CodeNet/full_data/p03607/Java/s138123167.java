import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=n;
		int []a=new int [100010];
		for(int i=1;i<=n;i++){
			a[i]=in.nextInt();
		}
		for(int i=1;i<n;i++){
			for(int j=i+1;j<=n;j++){
				if (a[i]==a[j])
					sum-=2;
			}
		}
		System.out.println(sum);
	}
}