import java.util.Collections;
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
			Long index1;
			Long index2;
			Long index3;
			Long num;
			Long indexL;
			
			X=sc.nextInt();
			Y=sc.nextInt();
			Z=sc.nextInt();
			K=sc.nextInt();
			
			Map <Long,Integer> mapX= new TreeMap<Long,Integer> (Collections.reverseOrder());
			Map <Long,Integer> mapY= new TreeMap<Long,Integer> (Collections.reverseOrder());
			Map <Long,Integer> mapZ= new TreeMap<Long,Integer> (Collections.reverseOrder());
			Map <Long,Long> map= new TreeMap<Long,Long> (Collections.reverseOrder());

			for(index=0;index<X;index++) {
				a = sc.nextLong();
				mapX.put(a,index);
			}
			for(index=0;index<Y;index++) {
				a = sc.nextLong();
				mapY.put(a,index);
			}
			for(index=0;index<Z;index++) {
				a = sc.nextLong();
				mapZ.put(a,index);
			}
			sc.close();
			index1=0L;
			LoopX: for(Long indexX: mapX.keySet()) {
				if(index1>=K) break LoopX;
				index2=0L;
				LoopY: for(Long indexY : mapY.keySet()) {
					if(index1+index2>=K) break LoopY;
					index3=0L;
					LoopZ: for(Long indexZ : mapZ.keySet()) {
						if(index1+index2+index3>=K) break LoopZ;
						a=indexX+indexY+indexZ;
						if(map.containsKey(a)) {
							num=map.get(a);
							map.put(a, num+1);
							}
						else {
							map.put(a,1L);
							}
						index3++;
						}
					index2++;
					}
				index1++;
				}
			// 
			
			// 出力
			indexL=0L;
			for(Long index0 : map.keySet()) {
				num=map.get(index0);
				for(index=0;index<num;index++) {
					System.out.println(index0);
					}
				indexL=indexL+num;
				if(indexL>=K) break;
			}
	}
}