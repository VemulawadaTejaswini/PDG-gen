import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static int N,M;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		City[] cityArr = new City[M];
		
		for(int i=0;i<M;i++) {
			int P = sc.nextInt();
			int Y = sc.nextInt();
			cityArr[i] = new City(P,Y,i);
		}
		Arrays.sort(cityArr,new Comparator<City>() {
			@Override
			public int compare(City o1, City o2) {
				// TODO Auto-generated method stub
				if(o1.xq>=o2.xq) {
					if(o1.year>=o2.year) {
						return 1;
					}else {
						return -1;
					}
				}else {
					return -1;
				}
			}
		});
		
		int sort = 0;
		City c = null;
		for(int i=0;i<cityArr.length;i++) {
			c = cityArr[i];
			if(i > 0 && cityArr[i].xq != cityArr[i-1].xq) {
				sort = 0;
			}
			sort++;
			String id = String.format("%06d", c.xq) + String.format("%06d", sort);
			c.id = id;
		}
		
		Arrays.sort(cityArr,new Comparator<City>() {
			@Override
			public int compare(City o1, City o2) {
				// TODO Auto-generated method stub
				if(o1.index>o2.index) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		
		for(int i=0;i<cityArr.length;i++) {
			System.out.println(cityArr[i].xq+":"+cityArr[i].year+":"+cityArr[i].index+":"+cityArr[i].id);
		}
	}
	
	public static class City{
		public int xq,year,index;
		public String id;

		public City(int xq, int year, int index) {
			super();
			this.xq = xq;
			this.year = year;
			this.index = index;
		}
	}

}
