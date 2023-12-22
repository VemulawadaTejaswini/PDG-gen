
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		ArrayDeque<Integer> a1 = new ArrayDeque<>();
		ArrayDeque<Integer> a2 = new ArrayDeque<>();
		for(int i=0; i<n; i++) {
			int d = sc.nextInt();
			a1.push(d);
			a2.add(d);
			ArrayDeque<Integer> tmp;
			tmp = a1;
			a1 = a2;
			a2 = tmp;
		}
		for(int i=0; i<n; i++) {
			if(i>0)System.out.print(" ");
			System.out.print(a2.poll());
		}
		System.out.println();
		sc.close();
	}





}
