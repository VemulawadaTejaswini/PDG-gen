import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		boolean flag=false;
		int c=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>=(1/(4.0*m))*sum) {
				c++;
			}
			if(c==m) {
				flag=true;
				break;
			}
		}
		System.out.println(flag? "Yes":"No");
		sc.close();
	}
}
