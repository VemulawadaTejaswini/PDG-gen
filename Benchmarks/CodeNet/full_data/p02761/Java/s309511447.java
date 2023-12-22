
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class P{
		int s;
		int c;
		P(int s, int c){
			this.s=s;
			this.c=c;
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();

		ArrayList<P> p = new ArrayList<P>();
		for(int i=0; i<m; i++) {
			p.add(new P(sc.nextInt(),sc.nextInt()));
		}

		for(int i=0; i<1000; i++) {
			ArrayList<Integer> d = new ArrayList<Integer>();
			d.add(i%10);
			int ni = i/10;
			int keta=1;
			while(ni>0) {
				d.add(0,ni%10);
				ni /= 10;
				keta++;
			}
			if(keta != n) continue;

			boolean ok = true;
			for(int j=0 ;j<p.size(); j++) {
				int s = p.get(j).s;
				int c = p.get(j).c;
				if(d.get(s-1) != c) {
					ok = false;
				}
			}
			if(ok) {
				System.out.println(i);
				sc.close();
				return;
			}
		}
		System.out.println(-1);
		sc.close();
	}
}
