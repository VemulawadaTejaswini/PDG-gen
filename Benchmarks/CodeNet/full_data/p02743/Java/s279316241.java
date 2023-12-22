import java.util.*;

class Main{

    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
      
        double rA = Math.sqrt(a);
		double rB = Math.sqrt(b);
      	double rC = Math.sqrt(c);
            
      	if(a+b < c){
	        System.out.println("YES");    	
        }
      	else{
	        System.out.println("NO");    	        
        }

    }
}