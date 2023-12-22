

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
	private static boolean ispf = false;

	public static void main(String[] args) {
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
			City city = new City(i+1,xqindex, ctyear);
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
		CountDownLatch countDownLatch = new CountDownLatch(xscs.size());
		ExecutorService es = Executors.newFixedThreadPool(4);
		for (Map.Entry<Integer, List<Integer>> entry : xscs.entrySet()) { 
			es.submit(new ListPx(entry.getValue(),countDownLatch));
			/*Integer[] pxq = entry.getValue().toArray(new Integer[0]);
			
			Arrays.sort(pxq);
			entry.setValue(Arrays.asList(pxq));*/
			/*
			Collections.sort(entry.getValue());
			pf("Key = " + entry.getKey() + ", Value = " + entry.getValue()); */
		}
		pf("排序后结果:" + xscs);
		sc.close();
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Integer> cityYearList = null;
		for (City city : cityList) {
			int year = city.getYear();
			cityYearList = xscs.get(city.getXq());
			int ctYearIndex = cityYearList.indexOf(year);
			String yearNo = String.format("%06d" , ctYearIndex+1);
			pf(city+":"+city.getXqNo()+yearNo);
			//.................................//
			System.out.println(city.getXqNo()+yearNo);
		}
		
		es.shutdown();
		
	}

	public static void pf(String s) {
		if (ispf) {
			System.out.println(s);
		}
	}
	
}
class ListPx implements Runnable{
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
	
}
class City{
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
	public City(int seq,int xq, int year) {
		super();
		this.seq = seq;
		this.xq = xq;
		this.year = year;
		this.xqNo = String.format("%06d" , xq);
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