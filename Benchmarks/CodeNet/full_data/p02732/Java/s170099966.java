import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
  		int[] a=new int[n];

  		int[] b=new int[n+1];
  		b[0]=0;
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
          	b[a[c]]++;
    	}
  		long d=0;
  
  		for(int c=0;c<n+1;c++){
        	d+=b[c]*(b[c]-1)/2;
        }
  		long ans=0;
  		for(int c=1;c<n+1;c++){
        	ans=d-b[a[c-1]]*(b[a[c-1]]-1)/2+(b[a[c-1]]-1)*(b[a[c-1]]-2)/2;
          System.out.println(ans);
        }
    
 	

    	
    }
}