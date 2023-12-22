
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Integer p[] = new Integer[a];
		Integer q[] = new Integer[b];
		Integer r[] = new Integer[c];
		for(int i=0; i<a; i++) p[i]=sc.nextInt();
		for(int i=0; i<b; i++) q[i]=sc.nextInt();
		for(int i=0; i<c; i++) r[i]=sc.nextInt();
		Arrays.sort(p, Collections.reverseOrder());
		Arrays.sort(q, Collections.reverseOrder());
		Arrays.sort(r, Collections.reverseOrder());

		long sum = 0;
		int i=0;
		int j=0;
		int k=0;
		while(k<x) {
			if(j<c && p[i]<r[j]) {
				sum += r[j];
				j++;
			}else {
				sum += p[i];
				i++;
			}
			k++;
		}
		k=0;
		i=0;
		while(k<y) {
			if(j<c && q[i]<r[j]) {
				sum += r[j];
				j++;
			}else {
				sum += q[i];
				i++;
			}
			k++;
		}
		System.out.println(sum);
		sc.close();
	}
}
