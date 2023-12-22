import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for (int i=0;i<n;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		int c=0;
		for (int i=n-1;i>=0;i--){
			while(a[i]%b[i]!=0){
				for (int j=0;j<=i;j++){
					a[j]=a[j]+1;
				}
				c=c+1;
			}
		}
		System.out.println(c);
	}

}
