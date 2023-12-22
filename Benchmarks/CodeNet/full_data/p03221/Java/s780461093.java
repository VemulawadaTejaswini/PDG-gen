import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	

	
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			List<Model> list = new ArrayList<>();
			for (int i = 1; i <= M; i++) {
				int P = sc.nextInt();
				int Y = sc.nextInt();
				Model model = new Model(i, P, Y);
				list.add(model);
			}
			
			list.sort(Comparator.comparing(Model::getKen).thenComparing(Model::getYear));
			
			int kenCount = 0;
			int yearCount = 0;
			for (Model m : list) {
				if(m.getKen() != kenCount) {
					kenCount = m.getKen();
					yearCount = 1;
				}
				m.setMoji(kenCount, yearCount);
				yearCount++;
			}
			list.sort(Comparator.comparing(Model::getIndex));
			list.forEach(m -> System.out.println(m.getMoji()));
		} // Scanner Close
	}
}

 class Model {
	public int index;
	public int ken;
	public int year;
	public String moji;
	public Model(int index, int ken, int year) {
		this.index = index;
		this.ken = ken;
		this.year = year;
	}
	public int getIndex() {
		return this.index;
	}
	public int getKen() {
		return this.ken;
	}
	public int getYear() {
		return this.year;
	}
	public void setMoji(int ken, int year) {
		String kenMoji = String.format("%06d", ken);
		String yearMoji = String.format("%06d", year);
		StringBuffer sb = new StringBuffer();
		this.moji = sb.append(kenMoji).append(yearMoji).toString();
	}
	public String getMoji() {
		return this.moji;
	}
}