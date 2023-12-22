import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		List<CityVo> list = new ArrayList<CityVo>();
		for(int i=0; i < M; i++) {
			CityVo cityVo = new CityVo();
			cityVo.setIndex(String.valueOf(i));
			cityVo.setCity(String.valueOf(in.nextInt()));
			cityVo.setYear(String.valueOf(in.nextInt()));
			list.add(cityVo);
		}
		
		Set<String> citySet = new HashSet<String>();
		for (CityVo cityVo : list) {
			citySet.add(cityVo.getCity());
		}

		List<CityVo> list2 = new ArrayList<CityVo>();
		for (String tempCity : citySet) {
			List<CityVo> templist = new ArrayList<CityVo>();
			for (CityVo cityVo : list) {
				if(tempCity.equals(cityVo.getCity())) {
					templist.add(cityVo);
				}
			}
			Collections.sort(templist, new Comparator<CityVo>(){
	           
	            @Override
	            public int compare(CityVo o1, CityVo o2) {
	            	// TODO Auto-generated method stub
	            	return o1.getYear().compareTo(o2.getYear());
	            }
	        });
			
			for(int index = 1; index <= templist.size(); index++) {
				CityVo cityVo = templist.get(index-1);
				String city = String.valueOf((1000000 + Integer.parseInt(cityVo.getCity()))).substring(1);
				String year = String.valueOf(1000000 + index).substring(1);
				cityVo.setCity(city);
				cityVo.setYear(year);
				cityVo.setCityyear(city+year);
			}
			
			list2.addAll(templist);
		}
		
		if(list2.size() > 0) {
			Collections.sort(list2, new Comparator<CityVo>(){
		           
	            @Override
	            public int compare(CityVo o1, CityVo o2) {
	            	// TODO Auto-generated method stub
	            	return o1.getIndex().compareTo(o2.getIndex());
	            }
	        });
		}
		for (CityVo cityVo : list2) {
			System.out.println(cityVo.getCityyear());
		}
	}
}


class CityVo {
	String index;
	String city;
	String year;
	String cityyear;
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getCityyear() {
		return cityyear;
	}
	public void setCityyear(String cityyear) {
		this.cityyear = cityyear;
	}
	@Override
	public String toString() {
		return "CityVo [index=" + index + ", city=" + city + ", year=" + year + ", cityyear=" + cityyear + "]";
	}
	
	
}
