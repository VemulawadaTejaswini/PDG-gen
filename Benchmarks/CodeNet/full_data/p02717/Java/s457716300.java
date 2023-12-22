import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int x, y, z;
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		//swap box A and B
		int copy = x;
		x = y;
		y = copy;
		//swap box A and C
		copy = x;
		x = z;
		z = copy;
		System.out.println("" + x + " " + y + " " + z);
	}
}