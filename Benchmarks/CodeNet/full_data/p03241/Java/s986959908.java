import java.util.*;

public class main {
	public static void main (String[] args){
     Scanner scan = new Scanner(System.in);
     
     int N = scan.nextInt();
     int M = scan.nextInt();
     
     
     int k = (int)M/N;
     
    
     int ans=1;
     
     for(int i=2;i<=k;i++){
    	 if(M%i==0){
    		 ans=i;
    	 }
     }	 
     System.out.println(ans);
}
}
