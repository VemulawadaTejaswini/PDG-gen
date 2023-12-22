import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Bean> list = new ArrayList<>();

		int N = in.nextInt();

		for ( int i = 0; i < N; i++ ) {
			Bean bean = new Bean(i, in.next(), in.nextInt());
			list.add(bean);			
		}
		
		Collections.sort(list, new MyComp());
		
		for ( Bean bean : list ) {
			System.out.println(bean.getNum() + 1);
		}


		in.close();
	}
}

class Bean {

	private int num = 0;
	private String	city;
	private int		point;

	public Bean(int num, String city, int point) {
		this.num = num;
		this.point = point;
		this.city = city;
	}
	
	public int getNum() {
		return num;
	}

	public int getPoint() {
		return point;
	}

	public String getCity() {
		return city;
	}
}

class MyComp implements Comparator<Bean> {

	public int compare(Bean b1, Bean b2) {
		if ( b1.getCity().compareTo(b2.getCity()) != 0 ) {
			return b1.getCity().compareTo(b2.getCity());
		} else {
			return Integer.compare(b2.getPoint(), b1.getPoint());
		}
	}
}
