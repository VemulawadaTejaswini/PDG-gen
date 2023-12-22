import java.util.*; 
 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
  
  		int[] p=new int[m];
        String[] s=new String[m];
  
  		for(int a=0;a<m;a++){
        p[a]=sc.nextInt();
        s[a]=sc.next();
        }
 	 
  		int ac=0;
  		int wa=0;
  		
        int[] w=new int[n];
  		int[] a=new int[n];
  
      for(int c=0;c<m;c++){
      if(s[c].equals("WA")&&a[p[c]-1]==0){
       w[p[c]-1]++;
      }else if(s[c].equals("AC")&&a[p[c]-1]==0){
       a[p[c]-1]++;
       
      }
      }
  	for(int d=0;d<n;d++){
      ac+=a[d];
      if(a[d]==1){
      	 wa+=w[d];

      }
    }
  		  System.out.println(ac);
    	  System.out.println(wa);
}
}