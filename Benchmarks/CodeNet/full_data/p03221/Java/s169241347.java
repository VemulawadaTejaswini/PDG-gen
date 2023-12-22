import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
	private static boolean ispf = false;

	public static void main(String[] args) throws Exception {
		//Main.class.getResource("/com/lxr/sds/test.data")
		//BufferedReader br = new BufferedReader(new InputStreamReader(Main.class.getResourceAsStream("/com/lxr/sds/test.data")));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] systemInLine = br.readLine().split(" ");
		int provinceCount = Integer.parseInt(systemInLine[0]);
		int cityCount = Integer.parseInt(systemInLine[1]);
		pf("辖区总数:" + provinceCount+" 城市总数:" + cityCount);
		
		/**
		 * 辖区城市关系表
		 * key 		辖区编号
		 * value 	辖区对应的城市创建年份
		 */
		Map<Integer, List<Integer>> provinceCityMap = new HashMap<>(); 
		
		
		/**
		 * 所有的城市
		 */
		List<City> cityList = new ArrayList<>(cityCount);
		
		for (int i = 0; i < cityCount; i++) {
			systemInLine = br.readLine().split(" ");
			int provinceIndex = Integer.parseInt(systemInLine[0]);
			int cityCreateYear = Integer.parseInt(systemInLine[1]);
			
			City city = new City(i+1,provinceIndex, cityCreateYear);
			cityList.add(city);
			
			if(provinceCityMap.containsKey(provinceIndex)) {
				provinceCityMap.get(provinceIndex).add(cityCreateYear);
			}else {
				List<Integer> list = new ArrayList<>();
				list.add(cityCreateYear);
				provinceCityMap.put(provinceIndex,list);
			}
		}
		br.close();
		//pf("辖区城市对应关系：" + provinceCityMap);
		
		pf("排序前结果:" + provinceCityMap);
		Map<Integer, Integer> yearNoMap = new HashMap<>();
		for (Map.Entry<Integer, List<Integer>> provinceCityYears : provinceCityMap.entrySet()) { 
			//排序会耗时!!!!!!!!!!
			//Collections.sort(provinceCityYears.getValue());
			List<Integer> arr = provinceCityYears.getValue();
			
			//System.out.println(Arrays.toString(arr));
			for (int i = 0; i < arr.size(); i++) {
				for (int j = i+1; j < arr.size(); j++) {
					if(arr.get(i)>arr.get(j)) {
						int t = arr.get(i);
						arr.set(i, arr.get(j));
						arr.set(j, t);
					}
					
				}
				yearNoMap.put(arr.get(i), i+1);
			}
		}
		pf("排序后结果:" + provinceCityMap);
		
		for (City city : cityList) {
			int year = city.getYear();
			//读取会耗时!!!!!!!!!!
			String yearNo = String.format("%06d" , yearNoMap.get(year));
			
			//.................................//
			System.out.println(city.getProvinceNo()+yearNo);
		}
	}

	public static void pf(String s) {
		if (ispf) {
			System.out.println(s);
		}
	}
}
class City{
	//序号
	private int seq;
	//辖区编号
	private String provinceNo;
	//辖区
	private int province;
	//创建日期
	private int year;
	
	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getProvinceNo() {
		return provinceNo;
	}

	public void setProvinceNo(String provinceNo) {
		this.provinceNo = provinceNo;
	}

	public int getProvince() {
		return province;
	}

	public void setProvince(int province) {
		this.province = province;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * 
	 * @param seq 		序号
	 * @param province 	辖区
	 * @param year 		创建日期
	 */
	public City(int seq, int province, int year) {
		super();
		this.seq = seq;
		this.province = province;
		this.year = year;
		this.provinceNo = String.format("%06d" , province);
	}

	@Override
	public String toString() {
		return "City [seq=" + seq + ", provinceNo=" + provinceNo + ", province=" + province + ", year=" + year + "]";
	}
	
	
	
}