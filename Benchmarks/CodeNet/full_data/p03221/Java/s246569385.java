
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ABC11X_A();
		// ABC11X_B();
		ABC11X_C();
		// ABC11X_D();
	}

	private static void ABC11X_A() {
		Scanner scanner = null;
		int amountX = 0;
		int amountY = 0;

		try {
			scanner = new Scanner(System.in);
			amountX = scanner.nextInt();
			amountY = scanner.nextInt();

			int total = amountX + (amountY / 2);

			System.out.println(total);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC11X_B() {
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			int numN = scanner.nextInt();
			double numT = scanner.nextInt();
			double numA = scanner.nextInt();

			double minA = Double.MAX_VALUE;
			int targetN = Integer.MAX_VALUE;
			double wkTemp = Double.MAX_VALUE;
			for (int i = 0; i < numN; i++) {
				wkTemp = Math.abs(numA - (numT - scanner.nextInt() * 0.006));
				if (minA > wkTemp) {
					minA = wkTemp;
					targetN = i;
				}
			}

			System.out.println(targetN + 1);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static class City {
		public int cityTanjou = -1;
		public int cityNum = -1;
		public int numKen = 0;
		public int year = 0;

		public City(int cityNum, int numKen, int year) {
			this.cityNum = cityNum;
			this.numKen = numKen;
			this.year = year;
		}

		public String getNinshiki() {
			return String.format("%06d%06d", numKen, cityTanjou + 1);
		}
	}

	private static void ABC11X_C() {
		Scanner scanner = null;
		int numNKen = 0;
		int numMShi = 0;

		try {
			scanner = new Scanner(System.in);
			numNKen = scanner.nextInt();
			numMShi = scanner.nextInt();

			List<City> cityList = new ArrayList<City>();
			for (int i = 0; i < numMShi; i++) {
				City city = new City(i, scanner.nextInt(), scanner.nextInt());
				cityList.add(city);
			}

			Collections.sort(cityList, new CityComparator());

			City nowCity = null;
			City preCity = null;
			for (int i = 0; i < cityList.size(); i++) {
				if (i != 0) {
					nowCity = cityList.get(i);
					preCity = cityList.get(i - 1);
					if (nowCity.numKen == preCity.numKen) {
						nowCity.cityTanjou = preCity.cityTanjou + 1;
					} else {
						nowCity.cityTanjou = 0;
					}
				} else {
					cityList.get(i).cityTanjou = 0;
				}

			}

			Collections.sort(cityList, new CityComparator2());

			for (City city : cityList) {
				System.out.println(city.getNinshiki());
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static class CityComparator2 implements Comparator<City> {

		@Override
		public int compare(City o1, City o2) {
			if (o1.cityNum > o2.cityNum) {
				return -1;
			} else if (o1.cityNum < o2.cityNum) {
				return 1;
			} else if (o1.cityNum == o2.cityNum) {
				return 0;
			}
			return 0;
		}

	}

	private static class CityComparator implements Comparator<City> {

		@Override
		public int compare(City o1, City o2) {
			if (o1.numKen > o2.numKen) {
				return -1;
			} else if (o1.numKen < o2.numKen) {
				return 1;
			} else if (o1.numKen == o2.numKen) {
				if (o1.year > o2.year) {
					return -1;
				} else if (o1.year < o2.year) {
					return 1;
				} else if (o1.year == o2.year) {
					return 0;
				}
			}
			return 0;
		}

	}

	private static void ABC11X_D() {
		Scanner scanner = null;
		int lineAB = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println();

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

}
