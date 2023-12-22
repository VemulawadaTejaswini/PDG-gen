
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	private static boolean ispf = false;

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int xqsl = sc.nextInt();
		int ctcount = sc.nextInt();
		pf("辖区总数:" + xqsl);
		pf("城市总数:" + ctcount);

		// 所有年份的纪录
		List<Integer> years = new ArrayList<>(ctcount);
		// 辖区城市总数
		Map<Integer, Integer> xqCount = new HashMap<>();
		// 所有城市纪录
		List<City> cityList = new ArrayList<>();
		for (int i = 0; i < ctcount; i++) {
			int xqindex = sc.nextInt();
			int ctyear = sc.nextInt();
			years.add(ctyear);

			City city = new City(i + 1, xqindex, ctyear);
			cityList.add(city);

			if (!xqCount.containsKey(xqindex)) {
				xqCount.put(xqindex, 1);
			} else {
				xqCount.put(xqindex, xqCount.get(xqindex) + 1);
			}

			pf("第" + (i + 1) + "个城市隶属于辖区:" + xqindex + ",该辖区编号:" + city.getXqNo());
			pf("第" + (i + 1) + "个城市创建于:" + ctyear);
		}
		sc.close();
		Collections.sort(years);

		for (City city : cityList) {
			int year = city.getYear();

			int ctYearIndex = years.indexOf(year);
			if (ctYearIndex > xqCount.get(city.getXq())) {
				for (int i = 1; i < ctYearIndex; i++) {
					ctYearIndex = ctYearIndex - xqCount.get(i);
				}
			}
			System.out.println(city.getXqNo() + String.format("%06d", ctYearIndex + 1));

		}

	}

	public static void pf(String s) {
		if (ispf) {
			System.out.println(s);
		}
	}

}

/*class ListPx implements Runnable {
	private List<Integer> cityYearList;
	private CountDownLatch latch;

	public ListPx(List<Integer> cityYearList, CountDownLatch latch) {
		super();
		this.cityYearList = cityYearList;
		this.latch = latch;
	}

	@Override
	public void run() {
		Collections.sort(cityYearList);
		latch.countDown();
	}

}*/

class City {
	private int seq;
	private int xq;
	private String xqNo;
	private int year;

	public int getXq() {
		return xq;
	}

	public void setXq(int xq) {
		this.xq = xq;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public City(int seq, int xq, int year) {
		super();
		this.seq = seq;
		this.xq = xq;
		this.year = year;
		this.xqNo = String.format("%06d", xq);
	}

	public void setXqNo(String xqNo) {
		this.xqNo = xqNo;
	}

	public String getXqNo() {
		return xqNo;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getSeq() {
		return seq;
	}

	@Override
	public String toString() {
		return "City [xq=" + xq + ", year=" + year + "]";
	}

}