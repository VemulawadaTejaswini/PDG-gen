import java.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Main{
	static int N,M;
	static int[] List;
	static int[][] city;
	static int[] Answer;
	
	public static class City implements Comparable<City> {
	    private int Pi;
	    private int Yi;
	    private int Count;
	    private int Flag;

	    public City(int Pi, int Yi, int Count, int Flag) {
	        this.Pi = Pi;
	        this.Yi = Yi;
	        this.Count=Count;
	        this.Flag = Flag;
	    }
	    @Override
	    public int compareTo(City o) {
	        return this.Yi - o.Yi;        
	    }
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		N = ss.nextInt();
		M = ss.nextInt();
		List = new int[M];
		city = new int[M][4];
		java.util.List<City> list =new ArrayList<>();
		for (int i = 0; i < M; i++) {
			city[i][0] = ss.nextInt();
			city[i][1] = ss.nextInt();	
			city[i][2] = 1;
			city[i][3] =i;
			list.add(new City(city[i][0], city[i][1], city[i][2], city[i][3]));
		}
		Collections.sort(list);
		for (int i = 1; i < M; i++) {
			City c = list.get(i);
			Object p = c.Pi;
			Object cnt = c.Count;
			int j;
			for ( j = i-1; j >= 0; j--) {
				City cc = list.get(j);
				Object p1 = cc.Pi;
				Object cnt1 = cc.Count;
				if(!p.equals(p1))continue;
				if(p.equals(p1)) {
					int count = Integer.parseInt(cnt1.toString());
					count++;
					list.set(i, new City(c.Pi, c.Yi, count, c.Flag));
					break;
					
				}
			}
		}
		Collections.sort(list, new Comparator<City>() {
		    @Override
		    public int compare(City o1, City o2) {
		        return o1.Flag - o2.Flag;
		    }
		});
		for (int i = 0; i < M; i++) {
			City out = list.get(i);
			Object out_1 = out.Pi;
			Object out_2 = out.Count;
			String aa = out_1.toString();
			int len = aa.length();
			int n = 6-len;
			for (int j = 0; j < n; j++) {
				System.out.print("0");
			}
			System.out.print(out_1);
			String bb = out_2.toString();
			int len1 = bb.length();
			int n1 = 6-len1;
			for (int j = 0; j < n1; j++) {
				System.out.print("0");
			}
			System.out.print(out_2);
			System.out.println();

		}
		
	}

}