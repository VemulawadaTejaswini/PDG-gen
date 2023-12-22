import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int norPri = sc.nextInt();
      	int freePri = sc.nextInt();
      	int busNorPri = sc.nextInt();
      	int busFreePri = sc.nextInt();
      
      	System.out.println(Math.min(norPri, freePri)
        	+ Math.min(busNorPri, busFreePri));
	}
}