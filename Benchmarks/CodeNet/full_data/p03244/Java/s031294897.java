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
			
			int N = scan.nextInt();
			int []v = new int[N];
			for(int i = 0;i<N;i++)v[i] = scan.nextInt();
			Map<Integer,Integer> odd = new TreeMap<Integer,Integer>();
			Map<Integer,Integer> ev = new TreeMap<Integer,Integer>();
			for(int i = 0;i<N;i++) {
				if(i%2==0) {//奇数
				if(odd.containsKey(v[i])) odd.put(v[i], odd.get(v[i])+1);
				else odd.put(v[i], 1);
				}else {//偶数
					if(ev.containsKey(v[i])) ev.put(v[i], ev.get(v[i])+1);
					else ev.put(v[i], 1);
				}
			}

			
			
			ArrayList<Entry<Integer,Integer>> olist = new ArrayList<Entry<Integer, Integer>>(odd.entrySet());
			ArrayList<Entry<Integer,Integer>> elist = new ArrayList<Entry<Integer, Integer>>(ev.entrySet());
			Comparator<Entry<Integer,Integer>> com = new COMP();
			
			Collections.sort(olist,com);	
			Collections.sort(elist,com);
			/*
			for(Entry<Integer,Integer>s:olist) {
				System.out.print(s.getKey());
				System.out.print(" ");
				System.out.print(s.getValue());
				System.out.println();
			}
			
			for(Entry<Integer,Integer>s:elist) {
				System.out.print(s.getKey());
				System.out.print(" ");
				System.out.print(s.getValue());
				System.out.println();
			}
			
			*/
			
			
			
			if(odd.size()+ev.size()==2&&olist.get(0).getKey()==elist.get(0).getKey()) {
				System.out.println(N/2);
				return;
			}
			
			
			int omax = 0;
			int emax = 0;
				omax = olist.get(0).getValue();
				emax = elist.get(0).getValue();
				
				if(olist.get(0).getKey()==elist.get(0).getKey()) {
					if(olist.size()==1) {
						emax = elist.get(1).getValue(); 
					}else if(elist.size()==1) {
						omax = olist.get(1).getValue();
					}else{
						if(olist.get(1).getValue()>=elist.get(1).getValue()) 
							omax = olist.get(1).getValue();
						else 
							emax = elist.get(1).getValue();
					}
				}
			
			
			System.out.println(N/2-emax+N/2-omax);
			
			
			
			
		}
		
		
	}
	static class COMP implements Comparator<Entry<Integer,Integer>>{
		public int compare(Entry<Integer,Integer> x,Entry<Integer,Integer> y) {
			return y.getValue().compareTo(x.getValue());
		}
		}
	
	
		

}
