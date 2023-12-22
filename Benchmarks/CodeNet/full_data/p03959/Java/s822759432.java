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
	     
	     int k[] = new int[n];
	     int a[] = new int[n];
	     
	     for(int i=0;i<n;i++)
	    	 k[i]=in.nextInt();
	     for(int i=0;i<n;i++)
	    	 a[i]=in.nextInt();
	     

	     int krr[] = new int [n];
	     boolean ck[] = new boolean [n];
	     krr[0]=k[0];
	     ck[0]=true;
	     for(int i=1;i<n;i++){
		 	    if(k[i-1]!=k[i]){		 	    	
		 	    	ck[i]=true;
		 	    }
		 	   krr[i]=k[i];
		 }	     
		 int arr[] = new int [n];
		 boolean ca[] = new boolean [n];
	     arr[a.length-1]=a[a.length-1];
	     ca[a.length-1]=true;
	     
	     for(int i=a.length-2;i>=0;i--){
		 	    if(a[i+1]!=a[i])
		 	    	ca[i]=true;
		 	    
		 	   arr[i]=a[i];
		 }

		 boolean flag = false;
		 long ans=1;
		 for(int i=0;i<n;i++){
			 if(ck[i]&&ca[i]&& k[i]!=a[i]){
				 flag=true;
				 break;
			 }
			 if(!ck[i]&&!ca[i]){
				 int tmp = k[i]>a[i]? a[i]:k[i];
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
