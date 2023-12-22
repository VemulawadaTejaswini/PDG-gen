import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int arr[]=new int[n+1];
			int ans[]=new int[n+1];
			arr[1]=0;
			for(int i=2;i<=n;i++){
				arr[i]=sc.nextInt();
				ans[arr[i]]++;
			}
			for(int i=1;i<=n;i++){
				System.out.println(ans[i]);
			}
		}
	}
}