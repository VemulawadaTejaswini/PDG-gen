	import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,n,k,count,m,answer,index;
		Map <Integer,Integer> mapA= new TreeMap<Integer,Integer>();
		float ans;
		String s,t;
		
			// 整数の入力
		
		n = sc.nextInt();
		count=0;
		
		for(index=0;index<n;index++) {
			a = sc.nextInt();
			mapA.put(a, index);
		}
		sc.close();

		for(Integer a2 : mapA.keySet()) {
			index = mapA.get(a2);
			System.out.print(index+1);
			System.out.print(" ");
		}

			// 出力
 
	}
}