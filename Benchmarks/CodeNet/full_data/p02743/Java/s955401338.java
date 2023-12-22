import java.util.*;

class Main{

    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
      
      	

            
      	if( (double)(4*a*b) < (double)((c - a - b) * (c - a - b))){
	        System.out.println("YES");    	
        }
      	else{
	        System.out.println("NO");    	        
        }

    }
}