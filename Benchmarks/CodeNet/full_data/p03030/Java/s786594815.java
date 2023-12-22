import static java.util.Comparator.*;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		ArrayList<SI> list = new ArrayList<SI>();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		for(int i = 1; i  <= n; i++) {
			SI si = new SI();
			si.loc = sc.next();
			si.p = sc.nextInt();
			si.no = i;
			list.add(si);
		}
		list.stream().sorted(comparing(SI::getLoc).thenComparing(SI::getP, reverseOrder()))
		.forEach(li -> System.out.println(li.getNo()));
	}

	
	
	

}
 class SI {
	String loc;
	int p;
	int no;
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
}
