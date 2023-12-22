import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long a = scan.nextLong();
		long b = scan.nextLong();

		int countred = 0;
		int countblue = 0;

		Deque<String> colors = new ArrayDeque();

		if(a ==0 || b ==0 || n-a-b == 0) {
		for(int i=0;i<b;i++) {
			colors.addLast("red");
			countred++;
		}

		for(int i =0;i<a;i++) {
			colors.addLast("blue");
			countblue++;
		}
		}else if(n > a+b){

				for(int i =0;i<a;i++) {
					colors.addLast("blue");
					countblue++;
				}
				for(int i=0;i<b;i++) {
					colors.addLast("red");
					countred++;
				}
				for(int i = 0;i<n-a-b;i++) {
					colors.addLast("blue");
					countblue++;
				}
		}


		System.out.println(countblue);
		scan.close();
	}

}
