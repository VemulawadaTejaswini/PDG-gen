import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		
		int[] a = new int[n];
		
		int counter =0;
		
		for(int i =0;i<n;i++) {
			a[i] = sc.nextInt();
			if(a[i]>x) {
				counter+=a[i]-x;
				a[i]=x;
			}
		}
		
		
		for(int i=0;i<n-1;i++) {
			if(a[i]+a[i+1]>x) {
				counter += a[i]+a[i+1]-x;
				a[i+1] -= a[i]+a[i+1]-x;
				
			}
		}
		
		
		System.out.println(counter);

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
