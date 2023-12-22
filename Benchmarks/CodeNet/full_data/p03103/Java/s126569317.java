import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		HashMap<Integer,Integer>drinkHashMap=new HashMap<>();
		
		Scanner sc=new Scanner(System.in);
		
		//栄養ドリンクが売られているお店の数
		long N=sc.nextLong();
		//集めたい栄養ドリンクの個数
		long M=sc.nextLong();
		long count=0;
		long sum=0;
		
		for(int i=0;i<N;i++) {
			//ドリンクの価格
			int A=sc.nextInt();
			//買える本数
			int B=sc.nextInt();
			
			drinkHashMap.put(A,B);
		}
		
		Object[] mapsort=drinkHashMap.keySet().toArray();
		List<Integer>listKey=new ArrayList<>(drinkHashMap.keySet());
		List<Integer>listValue=new ArrayList<>(drinkHashMap.values());
	
		for(int i=0;count<=M;i++) {
			if(count<M){
				int a=listKey.get(i);
				int b=listValue.get(i);
				if(drinkHashMap.containsKey(a)) {
					for(int j=0;j<b;j++){
						if(count<M) {
							count++;
							sum+=listKey.get(i);
						}else {
							break;
						}
					}
				}
			}else {
				break;
			}
		}
		
		System.out.println(sum);
	}

}
