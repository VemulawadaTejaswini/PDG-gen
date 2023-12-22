import java.util.*; 
import java.io.*; 

public class Main {
	public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     int health = sc.nextInt(); 
     int attack = sc.nextInt(); 
     for(int i = 0; i<attack;i++) {
    	 health -= sc.nextInt(); 
     }
     if(health <= 0) {
    	 System.out.println("Yes");
     }
     else System.out.println("No"); 
	}
}
