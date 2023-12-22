import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
      	int m = sc.nextInt();
      	if(m > 12) {
        	System.out.println((24 - m) + 24);  
        } else {
      		System.out.println(m + 24);
        }
	}
}