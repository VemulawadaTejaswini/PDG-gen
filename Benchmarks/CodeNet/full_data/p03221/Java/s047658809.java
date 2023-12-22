import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{
	private static boolean pf = false;

	public static void main(String[] args) {
		String[] padding = new String[]{"", "0", "00", "000", "0000", "00000"};
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int xqsl = sc.nextInt();
		int ctcount = sc.nextInt();
		pf("辖区总数:" + xqsl);
		pf("城市总数:" + ctcount);
		Map<Integer, List<Integer>> xscs = new HashMap<>(); 
		List<City> cityList = new ArrayList<>();
		for (int i = 0; i < ctcount; i++) {
			int xqindex = sc.nextInt();
			int ctyear = sc.nextInt();
			City city = new City(xqindex, ctyear);
			city.setXqNo(padding[getZeroCnt(xqindex)]+xqindex);
			cityList.add(city);
			if(xscs.containsKey(xqindex)) {
				xscs.get(xqindex).add(ctyear);
			}else {
				List<Integer> list = new ArrayList<>();
				list.add(ctyear);
				xscs.put(xqindex,list);
			}
			pf("第"+(i+1)+"个城市隶属于辖区:" + xqindex+",该辖区编号:"+city.getXqNo());
			pf("第"+(i+1)+"个城市创建于:" + ctyear);
		}
		pf("排序前结果:" + xscs);
		for (Map.Entry<Integer, List<Integer>> entry : xscs.entrySet()) { 
			Collections.sort(entry.getValue());
			pf("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
		}
		pf("排序后结果:" + xscs);
		sc.close();
		List<Integer> cityYearList = null;
		for (City city : cityList) {
			int year = city.getYear();
			cityYearList = xscs.get(city.getXq());
			int ctYearIndex = cityYearList.indexOf(year);
			String yearNo = String.format("%06d" , ctYearIndex+1);
			pf(city+":"+city.getXqNo()+yearNo);
			System.out.println(city.getXqNo()+padding[getZeroCnt(ctYearIndex+1)]+(ctYearIndex+1));
		}
	}

	public static void pf(String s) {
		if (pf) {
			System.out.println(s);
		}
	}
	private static int getZeroCnt(int n) {
        if (n < 10) return 5;
        else if (n < 100) return 4;
        else if (n < 1000) return 3;
        else if (n < 10000) return 2;
        else if (n < 100000) return 1;
        else return 0;
    }
	
}
class City{
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
	public City(int xq, int year) {
		super();
		this.xq = xq;
		this.year = year;
	}
	public void setXqNo(String xqNo) {
		this.xqNo = xqNo;
	}
	public String getXqNo() {
		return xqNo;
	}
	@Override
	public String toString() {
		return "City [xq=" + xq + ", year=" + year + "]";
	}
	
}