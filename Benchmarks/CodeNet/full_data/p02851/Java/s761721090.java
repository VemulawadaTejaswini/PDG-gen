
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		final int n=sc.nextInt();
		final int k=sc.nextInt();
		
		//ArrayList<Integer> a=new ArrayList();
		//ArrayList<Integer> s=new ArrayList();
		int[] a=new int[n];
		int[] s=new int[n];
		
		int sum=0;
		
		for(int i=0;i<n;i++){
			int m=sc.nextInt();
			//a.add(m);
			a[i]=m;
			sum=sum+m;
			//s.add(sum);
			s[i]=m;
			
		}
		
		int count=0;
		
		for(int i=1;i<k;i++){
			count=count+search(a,s,0,i-1,k);
			
		}
		
		System.out.println(count);
		
		
		
	}
   public static int search(int[] a, int[] s,int start,int end, int k){
	   int thiscount=0;
	   if(start==end){
		   if(a[start]%k==1)thiscount++;
	   }else if(start==0){
		   if((s[end])%k==(end+1))thiscount++;
	   }else if((s[end])-s[start-1]%k==(end-start+1)){
		   thiscount++;
	   }
	   if(end==a.length-1)return thiscount;
	   return thiscount+search(a,s,start+1,end+1,k);
	  
   }
	

}
