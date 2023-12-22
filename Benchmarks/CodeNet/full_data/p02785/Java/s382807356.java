import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int k = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<n;i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		
		for(int i =0;i<Math.min(k, n);i++) {
			list.remove(list.size()-1);
		}
		long sum =0;
		for(int i=0;i<n-k;i++) {
			sum+=list.get(i);
		}
		System.out.println(sum);
	}

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
