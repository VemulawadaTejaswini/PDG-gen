import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     
	     long k[] = new long[n];
	     long a[] = new long[n];
	     
	     for(int i=0;i<n;i++)
	    	 k[i]=in.nextLong();
	     for(int i=0;i<n;i++)
	    	 a[i]=in.nextLong();
	     

	     boolean ck[] = new boolean [n];

	     ck[0]=true;
	     for(int i=1;i<n;i++){
		 	    if(k[i-1]!=k[i]){		 	    	
		 	    	ck[i]=true;
		 	    }

		 }	     

		 boolean ca[] = new boolean [n];

	     ca[a.length-1]=true;
	     
	     for(int i=a.length-2;i>=0;i--){
		 	    if(a[i+1]!=a[i])
		 	    	ca[i]=true;
		 	    

		 }

		 boolean flag = false;
		 long ans=1;
		 for(int i=0;i<n;i++){
			 if(ck[i]&&ca[i]&& k[i]!=a[i]){
				 flag=true;
				 break;
			 }
			 if(!ck[i]&&!ca[i]){
				 long tmp = k[i]>a[i]? a[i]:k[i];
				 tmp%=1000000007;
				 ans*=tmp;
				 ans%=1000000007;
				 //System.out.println("i= "+i+" tmp= "+tmp);
			 }
			
		 }
		 	    
		 if(flag)
	    	 System.out.println(0);
	     else
	    	 System.out.println(ans);


    	 
	}

}
