import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
  		long ans=0;

  		long[] h=new long[n];
		for(int c=0;c<n;c++){
    		h[c]=sc.nextInt();
          	ans+=h[c];
    	}
  		int c=0;
  if(n<=k){
  		ans=0;
  }else{
     while(k>0){
  		for(int d=0;d<n;d++){
          if(h[c]<h[d]){
           	c=d;
          }
        }
     ans-=h[c];
     c=0;
     k--;
   }
  }		
    	System.out.println(ans);
    }
}