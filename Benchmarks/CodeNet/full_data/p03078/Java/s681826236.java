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
			int index;
			Long index1;
			Long index2;
			Long index3;
			Long num;
			Long num0;
			Long num1;
			Long num2;
			Long indexL;
			
			X=sc.nextInt();
			Y=sc.nextInt();
			Z=sc.nextInt();
			K=sc.nextInt();
			
			Map <Long,Long> mapX= new TreeMap<Long,Long> (Collections.reverseOrder());
			Map <Long,Long> mapY= new TreeMap<Long,Long> (Collections.reverseOrder());
			Map <Long,Long> mapXY= new TreeMap<Long,Long> (Collections.reverseOrder());
			Map <Long,Long> mapZ= new TreeMap<Long,Long> (Collections.reverseOrder());
			Map <Long,Long> map= new TreeMap<Long,Long> (Collections.reverseOrder());

			for(index=0;index<X;index++) {
				a = sc.nextLong();
				if(mapX.containsKey(a)) {
					num0=mapX.get(a);
					mapX.put(a, num0+1);
					}
				else {
					mapX.put(a,1L);
					}
			}
			for(index=0;index<Y;index++) {
				a = sc.nextLong();
				if(mapY.containsKey(a)) {
					num0=mapY.get(a);
					mapY.put(a, num0+1);
					}
				else {
					mapY.put(a,1L);
					}
			}
			for(index=0;index<Z;index++) {
				a = sc.nextLong();
				if(mapZ.containsKey(a)) {
					num0=mapZ.get(a);
					mapZ.put(a, num0+1);
					}
				else {
					mapZ.put(a,1L);
					}
			}
			sc.close();
			
			index1=0L;
			LoopX: for(Long indexX: mapX.keySet()) {
				if(index1>=K) break LoopX;
				index2=0L;
				LoopY: for(Long indexY : mapY.keySet()) {
					if(index1+index2>=K) break LoopY;
					a=indexX+indexY;
					if(mapXY.containsKey(a)) {
						num0=mapX.get(indexX);
						num1=mapY.get(indexY);
						num=(long)num0*(long)num1;
						mapXY.put(a, mapXY.get(a)+num);
						}
					else {
						num0=mapX.get(indexX);
						num1=mapY.get(indexY);
						num=(long)num0*(long)num1;
						mapXY.put(a,num);
						}
					index2=index2+mapY.get(indexY);
					}
				index1=index1+mapX.get(indexX);
				}
			//
			index1=0L;
			LoopXY: for(Long indexXY: mapXY.keySet()) {
				if(index1>=K) break LoopXY;
				index2=0L;
				LoopZ: for(Long indexZ : mapZ.keySet()) {
					if(index1+index2>=K) break LoopZ;
					a=indexXY+indexZ;
					if(map.containsKey(a)) {
						num0=mapXY.get(indexXY);
						num1=mapZ.get(indexZ);
						num=(long)num0*(long)num1;
						map.put(a, map.get(a)+num);
						}
					else {
						num0=mapXY.get(indexXY);
						num1=mapZ.get(indexZ);
						num=(long)num0*(long)num1;
						map.put(a,num);
						}
					index2=index2+mapZ.get(indexZ);
					}
				index1=index1+mapXY.get(indexXY);
				}
			// 
			
			// 出力
			indexL=0L;
			for(Long index0 : map.keySet()) {
				num=map.get(index0);
				if(indexL+num>=K) {
					num=K-indexL;
				}
				for(index=0;index<num;index++) {
					System.out.println(index0);
					}
				indexL=indexL+num;
				if(indexL>=K) break;
			}
	}
}