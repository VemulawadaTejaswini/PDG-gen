import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int X;
			int Y;
			int Z;
			int K;
			
			Long a;
			Long b;
			Long c;
			Long sum;
			int index;
			int index2;
			int index3;
			Long num;
			Long indexL;
			
			X=sc.nextInt();
			Y=sc.nextInt();
			Z=sc.nextInt();
			K=sc.nextInt();
			
			Map <Integer,Long> mapX= new HashMap<Integer,Long> ();
			Map <Integer,Long> mapY= new HashMap<Integer,Long> ();
			Map <Integer,Long> mapZ= new HashMap<Integer,Long> ();
			Map <Long,Long> map= new TreeMap<Long,Long> (Collections.reverseOrder());

			for(index=0;index<X;index++) {
				a = sc.nextLong();
				mapX.put(index, a);
			}
			for(index=0;index<Y;index++) {
				a = sc.nextLong();
				mapY.put(index, a);
			}
			for(index=0;index<Z;index++) {
				a = sc.nextLong();
				mapZ.put(index, a);
			}
			sc.close();
			
			for(index=0;index<X;index++) {
				for(index2=0;index2<Y;index2++) {
					for(index3=0;index3<Z;index3++) {
						a = mapX.get(index);
						b = mapY.get(index2);
						c = mapZ.get(index3);
						if(map.containsKey(a+b+c)) {
							num=map.get(a+b+c);
							map.put(a+b+c, num+1);
							}
						else {
							map.put(a+b+c,1L);
							}
						}
						
					}
				}
			// 
			
			// 出力
			indexL=0L;
			for(Long index0 : map.keySet()) {
				num=map.get(index0);
				for(index2=0;index2<num;index2++) {
					System.out.println(index0);
					}
				indexL=indexL+num;
				if(indexL>=K) break;
			}
	}
}