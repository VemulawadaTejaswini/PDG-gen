import java.util.*; 
import java.io.*; 

public class Main {
	public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     int health = sc.nextInt(); 
     int attack = sc.nextInt(); 
     int ans = 0; 
     while( health > 0) {
    	 health -= attack ; 
    	 ans++ ;
     }
     System.out.println(ans); 
	}
}