import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ans=0;	
		int n=sc.nextInt();
		Integer P[]=new Integer[n];
		for (int i=0;i<n;i++){
		P[i]=sc.nextInt();
		}
		for (int i=1;i<n-1;i++){
			if((P[i-1]<P[i]&&P[i]<P[i+1])||(P[i+1]<P[i]&&P[i]<P[i-1])){
				ans=ans+1;
			}
		}
		
	System.out.println(ans);
	}
}