import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		int count=0;
		int sum=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			b[a[i]%n]+=a[i]%n;
		}
		for(int i=0;i<n;i++){
			if(b[i]==i)count++;
		}
		int max=a[0];
		for(int i=0;i<n;i++){
			if(max<a[i])max=a[i];
			sum+=a[i];
		}
		if(count==n && max<=sum/n)System.out.println("YES");
		else System.out.println("NO");
	}
}
