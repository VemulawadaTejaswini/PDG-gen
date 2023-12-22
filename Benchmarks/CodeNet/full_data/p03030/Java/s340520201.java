
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Res> list = new ArrayList<>();
		for(int i = 1; i < N + 1; i++) {
			list.add(new Res(sc.next(), sc.nextInt(), i));
		}
		list.sort(Comparator.comparing(Res::getCity)
				.thenComparing((o1, o2) -> Integer.compare(o2.getPoint(), o1.getPoint())));
		for(Res res : list) {
			System.out.println(res.getNum());
		}
	}

}

class Res {
	private String city;
	private int point;
	private int num;

	protected Res(String city, int point, int num) {
		super();
		this.city = city;
		this.point = point;
		this.num = num;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}