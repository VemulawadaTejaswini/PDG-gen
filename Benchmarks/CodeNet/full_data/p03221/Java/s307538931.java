import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class City {
	private int fP;
	private int fY;
	private int fFullId;
	private int fId;
	DecimalFormat dformat = new DecimalFormat("000000");

	public City(int p, int y, int fullId) {
		fP = p;
		fY = y;
		fFullId = fullId;
	}

	public int getY() {
		return fY;
	}

	public String getTextP() {
		return dformat.format(fP);
	}

	public int getP() {
		return fP;
	}

	public int getId() {
		return fId;
	}

	public String getTextId() {
		return dformat.format(fId);
	}

	public void setId(int id) {
		fId = id;
	}

	public int getfullId() {
		return fFullId;
	}
}

class compCity implements Comparator<City> {
	public int compare(City city1, City city2) {
		if (city1.getP() < city2.getP() || (city1.getP() == city2.getP() && city1.getY() < city2.getY())) {
			return -1;
		} else if (city1.getP() > city2.getP() || (city1.getP() == city2.getP() && city1.getY() > city2.getY())) {
			return 1;
		} else {
			return 0;
		}
	}
}

class compId implements Comparator<City> {
	public int compare(City city1, City city2) {
		if (city1.getfullId() < city2.getfullId()) {
			return -1;
		} else if (city1.getfullId() > city2.getfullId()) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<City> cityList = new ArrayList<City>(N);
		for (int i = 0; i < M; i++) {
			int p = sc.nextInt();
			int y = sc.nextInt();
			cityList.add(new City(p, y, i));
		}
		sc.close();

		Collections.sort(cityList, new compCity());

		int id = 1;
		int nowP = cityList.get(0).getP();
		for (int i = 0; i < M; i++) {
			if (nowP == cityList.get(i).getP()) {
				cityList.get(i).setId(id);
				id++;
			} else {
				nowP = cityList.get(i).getP();
				id = 1;
				cityList.get(i).setId(id);
				id++;
			}
		}

		Collections.sort(cityList, new compId());

		for (int i = 0; i < M; i++) {
			System.out.println(cityList.get(i).getTextP() + cityList.get(i).getTextId());
		}

	}
}