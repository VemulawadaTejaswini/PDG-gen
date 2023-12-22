import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	static int N=0,M=0,X=0,C=0;
	static int[][] Maps;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		HashMap<Integer, ArrayList<Integer>> Dic  = new HashMap<Integer, ArrayList<Integer>>();
		
		Maps = new int[M][2];
		for(int i=0;i<M;i++) {
			X =sc.nextInt();
			C =sc.nextInt();
			Maps[i][0] = X;
			Maps[i][1] = C;
			
			if(Dic.get(X) == null) {
				ArrayList<Integer> CList = new ArrayList<Integer>();
				CList.add(C);
				Dic.put(X, CList);
			}else {
				Dic.get(X).add(C);
			}
		}
		for(Integer Key:Dic.keySet()) {
			Collections.sort(Dic.get(Key));
		}
		HashMap<Integer, HashMap<Integer,Integer>> Dic1  = new HashMap<Integer, HashMap<Integer,Integer>>();
		int Num;
		ArrayList<Integer> TempList = new ArrayList<Integer>();
		for(int i=1;i<N+1;i++) {
			if(Dic.get(i) !=null) {
				TempList = Dic.get(i);
				HashMap<Integer,Integer> TempMap = new HashMap<Integer,Integer>();
				Iterator<Integer> iterator = TempList.iterator();
				Num = 1;
				while(iterator.hasNext()) {
					TempMap.put(iterator.next(), Num);
					Num++;
				}	
				Dic1.put(i, TempMap);
			}
		}
		for(int i=0;i<M;i++) {
			System.out.println(String.format("%06d", Maps[i][0])+String.format("%06d", Dic1.get(Maps[i][0]).get(Maps[i][1])));
					
		}
	}
}


