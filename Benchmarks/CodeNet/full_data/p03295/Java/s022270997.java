import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		ArrayList<Demand> list = new ArrayList<Demand>();
		for(int i = 0; i < m; i++){
			list.add(new Demand(sc.nextInt(), sc.nextInt()));
		}
		
		Collections.sort(list);
		int result = 0;
		while(!list.isEmpty()){
			//どの橋を落とすか決める
			Demand first = list.get(0);
			
			int bridgeID = -1;
			//距離1なら間違いなくその橋を落とすべき
			if(first.end - first.begin == 1){
				bridgeID = first.begin;
			}
			else {
				int max = 0;
				for(int i = first.begin ; i < first.end ; i++){
					int tmpMax = 0;
					
					Iterator<Demand> it = list.iterator();
					
					while(it.hasNext()){
						Demand tmpDm = it.next();
						
						if(tmpDm.hasBridge(i)){
							tmpMax++;
						}
					}
					
					if(max < tmpMax){
						max = tmpMax;
						bridgeID = i;
					}
				}
			}
			
			result++;
			
			Iterator<Demand> it = list.iterator();
			while(it.hasNext()){
				Demand tmpDm = it.next();
				if(tmpDm.hasBridge(bridgeID)){
					it.remove();
				}
			}
		}
		
		System.out.println(result);
	}
}

class Demand implements Comparable<Demand>{
	int begin;
	int end;
	
	Demand(int a, int b){
		this.begin = a;
		this.end = b;
	}

	@Override
	public int compareTo(Demand d) {
		return (this.end - this.begin) - (d.end - d.begin);
	}
	
	public boolean hasBridge(int bid){
		return begin <= bid && end > bid;
	}
}
