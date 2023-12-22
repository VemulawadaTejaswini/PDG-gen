import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int a = scan.nextInt();
      	int b = scan.nextInt();
      	int c = scan.nextInt();
      	int d = scan.nextInt();
      	int counter = b - a;
      	for(int i = a; i <= b; i++){
        	if(i % c && i % d){
            	counter--;
            }
          	else if(i % c){
            	counter --;
            }
          	else if(i % d){
            	counter --;
            }
        }
      	System.out.print(counter);
    
    }

}