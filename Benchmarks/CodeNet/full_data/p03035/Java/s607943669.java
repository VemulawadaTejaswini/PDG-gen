import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
      	int ageTaka = sc.nextInt();
      	int price = sc.nextInt();
      
		if(ageTaka >= 13) {
        	System.out.println(price);
        } else if(ageTaka <= 5) {
         	System.out.println(0); 
        } else {
         	System.out.println(price / 2); 
        }
    }
}