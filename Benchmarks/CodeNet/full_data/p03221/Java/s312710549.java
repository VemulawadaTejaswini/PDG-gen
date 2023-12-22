import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M=sc.nextInt();
		ArrayList<City> Cities=new ArrayList<City>();
		// スペース区切りの整数の入力
		for(int i=0;i<M;i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			int k=1;
			for(City city:Cities) {
				if(b==city.ken) {
					if(c<city.year) {
						city.renew(city.num+1);
					}else {
						k++;
					}
				}

			}
			Cities.add(new City(b,c,k));

		}
		// 文字列の入力
		//String s = sc.next();
		for(City city:Cities) {
			System.out.printf("%06d%06d\n", city.ken,city.num);
		}
	}
}
class City{
	int num;
	int year;
	int ken;
	City(int K,int Y,int N){
		ken=K;
		year=Y;
		num=N;
	}
	void renew(int N) {
		num=N;
	}
}
/*class CityCompare implements Comparator<City>{
	@Override
	public int compare(City c1,City c2) {
		if(c1.year>c2.year) {
			return 1;
		}else {
			return -1;
		}
	}
}*/