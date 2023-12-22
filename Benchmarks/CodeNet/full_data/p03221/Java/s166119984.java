import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,int[]> map = new HashMap<Integer,int[]>();
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		int[] list = new int[M];
		int n,year,m;
		for (int i = 0; i < M; i++) {
			n = sc.nextInt();
			year = sc.nextInt();
			map.put(year, new int[]{n,0});
			if (list1.size() < n) {
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(year);
				list1.add(temp);
			} else {
				list1.get(n-1).add(year);
			}
			list[i] = year;
		}
		
		for (List temp : list1) {
			Collections.sort(temp);
			for (int j = 0;j <temp.size();j++) {
				map.get(temp.get(j))[1]=j+1;
			}
		}
		
		for (int i = 0; i < M; i++) {
			year = list[i];
			n = map.get(year)[0];
			m = map.get(year)[1];
			
			System.out.println(String.format("%06d", n)+String.format("%06d", m));
		}
			
	}

}