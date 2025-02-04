import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		ArrayDeque<Integer> de = new ArrayDeque<>();
		Iterator<Integer> itr;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				int a = scan.nextInt();
				if ((i & 1) == 0) {
					de.addLast(Integer.valueOf(a));
				} else {
					de.addFirst(Integer.valueOf(a));
				}
			}
			if((n&1)==0){
				itr = de.iterator();
			}else{
				itr = de.descendingIterator();
			}
			System.out.print(itr.next());
			while(itr.hasNext()){
				System.out.print(" ");
				System.out.print(itr.next());
			}
			System.out.println("");

		scan.close();

	}

}