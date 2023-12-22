
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Restaurant[] restAry = new Restaurant[n];
		for(int i = 0; i < n; i++){
			String s = sc.next();
			int p = sc.nextInt();
			restAry[i] = new Restaurant(i + 1, s, p);
		}
		Arrays.sort(restAry);
		for(Restaurant rest : restAry){
			rest.printNum();
		}
	}
}
class Restaurant implements  Comparable<Restaurant>{
	int num;
	String cityName;
	int point;
	Restaurant(int n, String s, int p){
		num = n;
		cityName = s;
		point = p;
	}
	@Override
	public int compareTo(Restaurant rest) {
		int ret = this.cityName.compareTo(rest.cityName);
		if(ret != 0){
			return ret;
		}
		return Integer.compare(this.point, rest.point) * -1;
	}
	void printNum(){
		System.out.println(this.num);
	}
}
