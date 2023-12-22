import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int n = scan.nextInt();
			int[]v = new int[n];
			for(int i = 0;i<n;i++)v[i] = scan.nextInt();
			
			Map<Integer,Integer> O = new TreeMap<Integer,Integer>();
			Map<Integer,Integer> E= new TreeMap<Integer,Integer>();
			
			for(int i = 0;i<n;i++) {
				if(i%2==1) {//偶数
					if(E.containsKey(v[i])) E.put(v[i], E.get(v[i])+1);
					else E.put(v[i], 1);
				}else{//奇数
					if(O.containsKey(v[i])) O.put(v[i], O.get(v[i])+1);
					else O.put(v[i], 1);
				}
			}
			
			for(Integer key:O.keySet()) 
				O.put(key, n/2-O.get(key));
			for(Integer key:E.keySet()) 
				E.put(key, n/2-E.get(key));
			
			ArrayList<Entry<Integer,Integer>> olist = new ArrayList<Entry<Integer,Integer>>(O.entrySet());
			ArrayList<Entry<Integer,Integer>> elist = new ArrayList<Entry<Integer,Integer>>(E.entrySet());
			Comparator<Entry<Integer,Integer>> com = new COMP();
			
			Collections.sort(olist,com);
			Collections.sort(elist,com);
			
			for(Entry<Integer,Integer> ent:olist) {
				//System.out.print(ent.getKey());
				//System.out.print(" ");
				//System.out.println(ent.getValue());
			}
			
			//System.out.println();
			
			for(Entry<Integer,Integer> ent:elist) {
				//System.out.print(ent.getKey());
				//System.out.print(" ");
				//System.out.println(ent.getValue());
			}
			
		
			int el = elist.get(0).getKey();
			int ol = olist.get(0).getKey();
			
			if(el!=ol) {
				System.out.println(elist.get(0).getValue()+olist.get(0).getValue());
			}else{
				if(elist.size()==1&&olist.size()==1) {
					System.out.println(n/2);
					
				}else if(elist.size()==1) {
					System.out.println( elist.get(0).getValue()+olist.get(1).getValue());
					
				}else if(olist.size()==1) {
					System.out.println(elist.get(1).getValue()+olist.get(0).getValue());
				
				}else {
				int N = elist.get(0).getValue()+olist.get(1).getValue();
				int S= elist.get(1).getValue()+olist.get(0).getValue();
				
				if(N>=S) {
					System.out.println(S);
				
				}else {
					System.out.println(N);
				
				}
				}
			}
			
		
			
			
			
			
		}
		
		
	}
	
	
	
	static class COMP implements Comparator<Entry<Integer,Integer>>{
		public int compare(Entry<Integer,Integer> x,Entry<Integer,Integer> y) {
			return x.getValue().compareTo(y.getValue());
		}
		}
		

}
