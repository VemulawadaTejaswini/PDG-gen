
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main{
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		List <Data> L = new ArrayList<Data>();
		
		for(int i = 0 ; i < m ;i++) {
			int p = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());
			L.add(new Data(i,p,y));
		}
		
		String []s = new String [m];
		int []num = new int [n];
		Arrays.fill(num, 1);
		Collections.sort(L);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < m ;i++) {
			int id = L.get(i).getId();
			int pref = L.get(i).getPref();
			String t1 = String.format("%06d", pref);
			String t2 = String.format("%06d", num[pref-1]);
			sb.append(t1).append(t2);
			s[id] = sb.toString();
			sb.setLength(0);
			num[pref-1]++;
		}
		
		for(int i = 0 ; i < m ;i++) {
			System.out.println(s[i]);
		}

	}

}
class Data implements Comparable<Data>{
	private int id;
	private int pref;
	private int year;
	
	public Data(int id,int pref ,int year) {
		this.id = id;
		this.pref = pref;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public int getPref() {
		return pref;
	}
	public int getYear() {
		return year;
	}

	@Override
	public int compareTo(Data o) {
		return Integer.compare(this.year, o.getYear());
	}
	
	
}
