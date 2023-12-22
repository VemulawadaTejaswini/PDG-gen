import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		
		if((x + x == w) && (y + y == h)) {
		    System.out.println(Double.toString(w * h / 2.0) + ' ' + '1');
		}
		else {
		    System.out.println(Double.toString(w * h / 2.0) + ' ' + '0');
		}
		
	}
}