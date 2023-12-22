
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int z=sc.nextInt();
		long w=sc.nextLong();
		ArrayList<Long> a = new ArrayList<>();
		for(int i=0; i<n; i++) {
			a.add(sc.nextLong());
		}
		if(n==1) {
			System.out.println(Math.abs( a.get(n-1)-w));
		}else {
			System.out.println( Math.max(Math.abs(a.get(n-1)-a.get(n-2)), Math.abs(a.get(n-1)-w)));
		}
		sc.close();
	}
}
