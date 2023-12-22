import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
      	int moneyHold = sc.nextInt();
      	int satisNum = sc.nextInt();
      	int counter = 0;
      	
      	if(moneyHold < price) {
        	System.out.println(0);  
        } else {
        	if(moneyHold >= price * satisNum) {
            	System.out.println(satisNum); 
            } else {
              	for(int i = price; i <= moneyHold; i += price) {
                	counter++;
                }
            	System.out.println(counter);  
            }
        }
    }
}