import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		
		int a[]=new int [n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		//Arrays.sort(a);
		int sum=0;
		for(int i=0;i<n-1;i++){
			if((a[i]+a[i+1])>x){
				int m=a[i]+a[i+1]-x;
				sum+=m;
				if(a[i+1]>0){
					a[i+1]-=m;
				}else{
					a[i]-=m;
				}
				
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(sum);
		
	}
}