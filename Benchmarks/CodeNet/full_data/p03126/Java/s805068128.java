import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,m=0;
		
		n=sc.nextInt();
		m=sc.nextInt();
		
		int[] a=new int[m+1];
		
		while(sc.hasNext()){
			a[sc.nextInt()]++;
		}
		
		int ans=0;
		
		for(int i=0;i<m+1;i++){
			if(a[i]==n)ans++;
		}
		
		System.out.println(ans);
		
	}

}
