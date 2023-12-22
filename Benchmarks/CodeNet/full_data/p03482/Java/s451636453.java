import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int n = sc.nextInt();
		//int x = sc.nextInt();
		String s = sc.next();
		
		String[] ss = s.split("");
		
		//int[] a = new int[n];
		
		int n = ss.length;
		int ans = n/2;
		if(n%2==0) {
			if(ss[n/2-1].equals(ss[n/2])) {
				ans++;
			}
			for(int i=1;i<n/2;i++) {
				if(ss[n/2-1-i].equals(ss[n/2])&&ss[n/2+i].equals(ss[n/2])) {
					ans++;
				}else {
					break;
				}
			}
		}else {
			ans++;
			for(int i=1;i<n/2;i++) {
				if(ss[n/2-i].equals(ss[n/2])&&ss[n/2+i].equals(ss[n/2])) {
					ans++;
				}else {
					break;
				}
			}
		}
		
		
		
		System.out.println(ans+1);

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
