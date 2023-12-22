import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int isu = in.nextInt();
      	int hito = in.nextInt();
        int w = in.nextInt();
      

      System.out.print((isu-w)/(hito+w));
	}
}