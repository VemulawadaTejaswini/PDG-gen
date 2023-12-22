import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long D = sc.nextLong();
        
        long m = N/(2*D);
        if(N%(2*D)!=0) {
        	m=m+1;
        }
        		
        
        
        System.out.println(m);	
        
        
    }
}