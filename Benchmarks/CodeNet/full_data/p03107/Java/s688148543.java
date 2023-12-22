import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] ia = Stream.of(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
		int counter0 = 0;
		int counter1 = 0;

		for(int i : ia) {
			if(i==0)counter0++;
			if(i==1)counter1++;
		}

	    if (counter1 >= counter0) {
	        System.out.println(2 * counter0);
	     } else {
	        System.out.println(2 * counter1);
	     }

	}
}