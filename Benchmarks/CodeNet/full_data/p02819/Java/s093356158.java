import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int x = scn.nextInt();
			int ret;
			while(true){
			    if(isPrimeNum(x)){
			    ret = x;
			    break;    
			    }
			    x++;
			}
			
		
			System.out.println(ret);
		}
	}
	
    static boolean isPrimeNum(int num){
	    if(num==2) return true;
	   if(num % 2 == 0) return false;
	   for(int i = 2;i<num;i++){
	       if(num % i == 0) return false;
	   }
	    
	    return true;
	    
	}
}
