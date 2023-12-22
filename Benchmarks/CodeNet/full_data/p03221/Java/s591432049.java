import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int N,M;
	static City[] arr;
	static  List<Integer>[] cityList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new City[M]; 
		cityList = new ArrayList[N];
		
		for(int i=0;i<M;i++) {
			int P = sc.nextInt();
			int Y = sc.nextInt();
			arr[i] = new City(P,Y);
			
			if(cityList[P-1]==null) {
				cityList[P-1] = new ArrayList<Integer>();
			}
			cityList[P-1].add(Y);
		}
		
		for(int i=0;i<N;i++) {
			List<Integer> listt = cityList[i];
			if(cityList[i]!=null) {
				Collections.sort(listt);
			}
		}
		
		for(int i=0;i<M;i++) {
			City city = arr[i];
			List<Integer> listt = cityList[city.xq-1];
			int index = listt.indexOf(city.year);
			System.out.println(String.format("%06d", city.xq)+String.format("%06d", index+1));
		}
	}
	
	public static class City{
		private int xq;
		private int year;
		
		public City(int xq, int year) {
			super();
			this.xq = xq;
			this.year = year;
		}
		
	}

}
