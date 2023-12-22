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
		City ans[] = new City[m];
		for(int i = 0; i < m; i++) {
			ans[c[i].i] = c[i];
		}
		//Arrays.sort(c, (c1, c2) -> c1.i - c2.i);
		//for(int i = 0; i < m; i++) c[i].printNumber();
		for(int i = 0; i < m; i++) ans[i].printNumber();
		
		
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
			String s1 = "000000";
			String s2 = "000000";
			s1 = s1 + Integer.toString(p);
			s2 = s2 + Integer.toString(num);
			System.out.println(s1.substring(s1.length() - 6) + s2.substring(s2.length() - 6));
		}
	}
}

