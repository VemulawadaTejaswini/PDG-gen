import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
      	int mnyHd = sc.nextInt();
      	int ckPr = sc.nextInt();
      	int dtPr = sc.nextInt();
      	
      	System.out.println((mnyHd - ckPr) %dtPr);
	}
}