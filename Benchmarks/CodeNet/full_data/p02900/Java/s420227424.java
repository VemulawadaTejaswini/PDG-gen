import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		ArrayList<Long> alist = new ArrayList<>();
		
		long index = 2;
		while(index<=a) {
			if(a%index == 0) {
				a = a/index;
				alist.add(index);
			}else {
				index++;
			}
		}
		
		index=2;
		ArrayList<Long> common =  new ArrayList<>();
		
		while(index<=b) {
			if(b%index == 0) {
				b = b/index;
				if(alist.contains(index)) {
					if(!common.contains(index))common.add(index);
				}
			}else {
				index++;
			}
		}
		
		System.out.println(common.size()+1);
		
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