import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		char[] c = sc.next().toCharArray();
		
		c[K-1] = String.valueOf(c[K-1]).toLowerCase().toCharArray()[0];
		System.out.println(String.valueOf(c));
		sc.close();
	}
	
	
	
}