import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int x = sc.nextInt();
		//String s = sc.next();
		
		//String[] ss = s.split("");
		
		//int[] a = new int[n];
		int ans=-1;
		if( n>9) {
			
		}else {
			if(x>9) {
				
			}else {
				ans = n*x;
			}
		}
		
		System.out.println(ans);

		/*
		TreeMap<Integer,Integer> treeMap = new TreeMap<>();//sorted no duplication
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
