import java.util.LinkedList;
import java.util.Scanner;
 
class Cards {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<Integer>();
		int x = scan.nextInt();
		int counter = 0;
		for (int i = 0; i < x; i++) {
			int z = scan.nextInt();
			if (l.contains(z)) {
				counter++;
			} else {
				l.add(z);
			}
		}
		if(counter%2 == 1) {
			counter++;
		}
		System.out.print(x - counter);
	}
 
}