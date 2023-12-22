import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int[] a=new int[n];
  		int[] b=new int[n-1];
		for(int c=0;c<n-1;c++){
    		b[c]=sc.nextInt();
    	}
  		a[0]=b[0];
  		a[1]=b[0];
    for(int d=0;d<n-2;d++){
 	if(b[d]<=b[d+1]){
    		a[d+2]=b[d+1];
    	}else{
     		a[d+1]=b[d+1];
      		a[d+2]=b[d+1];
   	 }
    }
  		int ans=0;
  		for(int e=0;e<n;e++){
         ans+=a[e];
        }
    	System.out.println(ans);
    }
}