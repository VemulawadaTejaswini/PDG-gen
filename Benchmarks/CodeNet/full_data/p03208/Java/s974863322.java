import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
		long ans=(long)Math.pow(10,9);
		
  		long[] h=new long[n];
		for(int c=0;c<n;c++){
    		h[c]=sc.nextLong();
    	}
  		Arrays.sort(h);
  		
  		for(int b=0;b<n-k+1;b++){
        ans=Math.min(ans,h[b+k-1]-h[b]);
        }

    	System.out.println(ans);
    }
}