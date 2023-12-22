import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int d = sc.nextInt();
			a1.add(0, d);
			a2.add(d);
			ArrayList<Integer> tmp;
			tmp = a1;
			a1 = a2;
			a2 = tmp;
		}
		for(int i=0; i<n; i++) {
			if(i>0)System.out.print(" ");
			System.out.print(a2.get(i));
		}
		System.out.println();
		sc.close();
	}





}
