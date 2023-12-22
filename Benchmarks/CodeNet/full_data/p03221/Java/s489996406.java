import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		City[] c = new City[m];
		for(int i = 0; i < m; i++) {
			c[i] = new City(sc.nextInt(), sc.nextInt(), i);
		}
		Arrays.sort(c, (c1, c2) -> c1.y - c2.y);
		int pnum[] = new int[n + 1];
		Arrays.fill(pnum, 1);
		for(int i = 0; i < m; i++) {
			c[i].setNum(pnum[c[i].p]);
			pnum[c[i].p]++;
		}
		Arrays.sort(c, (c1, c2) -> c1.i - c2.i);
		for(int i = 0; i < m; i++) c[i].printNumber();
		
		
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}
	public class City {
		int p, y, i, num;
		int getY() {
			return y;
		}
		void setNum(int num) {
			this.num = num;
		}
		City(int p, int y, int i){
			this.p = p; this.y = y;this.i = i;
		}
		void printNumber(){
			System.out.println(String.format("%06d%06d",p ,num));
		}
	}
}

