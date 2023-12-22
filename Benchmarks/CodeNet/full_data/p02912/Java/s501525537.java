import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		/*
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		*/

		int[] counter = new int[30];
		for(int i=0;i<30;i++) {
			counter[i]=0;
		}


		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			list.add(a);
			counter[(int) Math.floor(Math.log(a)/Math.log(2))]++;

		}

		Collections.sort(list);

		int mm = 0;
		int limit = -1;
		int line =0;
		for(int i=29;i>-1;i--) {
			line +=counter[i];
			mm = mm +line;
			if(mm>m) {
				limit=i;
				break;
			}
		}

		long sum=0;
		for(int i =0;i<list.size();i++) {
			while(list.get(n-1-i)>=Math.pow(2, limit)&&m>0) {
				list.set(n-1-i,list.get(n-1-i)/2);
				m--;
			}

			sum+=list.get(n-1-i);
		}

		System.out.println(sum);

		/*
		TreeMap<Integer,Integer> treeMap = new TreeMap<>();
		treeMap.put(b[n], n);
		*/

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