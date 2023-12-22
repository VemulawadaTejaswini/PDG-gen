import java.util.Scanner;


public class Main {
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        long X = sc.nextLong();
        long max = 1;
        
        for(long i=2;i*i<=X;i++){
        	
        	long pow = i*i;
        	
        	for(;pow<=X;pow *= i)
        		if(max<pow)
        			max = pow;
        	
        }
        
        System.out.println(max);
		
	}


		

    
}