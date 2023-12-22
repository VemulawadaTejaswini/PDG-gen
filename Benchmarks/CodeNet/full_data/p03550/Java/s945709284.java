
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
		int w=sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0; i<n; i++) {
			a.add(sc.nextInt());
		}
		a.add(w);

		long max = 0;
		for(int i=0; i<n; i++) {
			long tmpmin = Long.MAX_VALUE;
			for(int j=i+1; j<=n; j++) {
				long tmp = Math.abs(a.get(i)-a.get(j));
				if(tmpmin > tmp){
					tmpmin = tmp;
				}
			}
			max = Math.max(max, tmpmin);
		}
		System.out.println(max);
		sc.close();
	}
}
