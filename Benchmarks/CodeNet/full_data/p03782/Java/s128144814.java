import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		int a[]=new int[N];
		boolean b[]=new boolean[N];
		
		int i=0;
		int all=0;
		int c=0;
		
		for(i=0;i<N;i++){
			a[i]=s.nextInt();
			all+=a[i];
		}
		
		Arrays.sort(a);
		
		if(K>all){
			c=N;
		}
		for(i=N-1;i>=0;i--){
			if(all-a[i]<K)break;
			all-=a[i];
			c++;
		}
		
		for(i=0;i<N;i++){
			if(all-a[i]<=K)break;
			all-=a[i];
			c++;
		}
			
		System.out.print(c);
		
        
	}

}
