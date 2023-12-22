import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	long a = scan.nextLong();
      	long b = scan.nextLong();
      	long c = scan.nextLong();
      	long d = scan.nextLong();
      	long counter = b - a + 1;
      	for(long i = a; i <= b; i++){
        	if(i % c == 0 && i % d == 0){
            	counter--;
            }
          	else if(i % c == 0){
            	counter --;
            }
          	else if(i % d == 0){
            	counter --;
            }
        }
      	System.out.print(counter);
    
    }
 
}