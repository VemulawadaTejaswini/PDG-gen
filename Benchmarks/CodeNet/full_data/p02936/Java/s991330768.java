import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		Map<Integer,Integer>m=new HashMap<>();
		for(int i=0;i<n-1;i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			m.put(b,a);
		}
		int[] ans=new int[n];
		for(int i=0;i<q;i++){
			int p=sc.nextInt()-1;
			int x=sc.nextInt();
			ans[p]+=x;
		}
		for(int i=1;i<n;i++)
			ans[i]+=ans[m.get(i)];
		for(int i=0;i<n;i++)
			System.out.println(ans[i]);
		
	}
	
}