import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		
		if(x < a) System.out.println(0);
		else System.out.println(10);
	}
}