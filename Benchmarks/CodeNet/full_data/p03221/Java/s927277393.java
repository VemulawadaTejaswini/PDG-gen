import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		sc.nextLine();
		ArrayList<ArrayList<Integer>> candidates = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> ansLists = new ArrayList<ArrayList<Integer>>();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

		for (int i = 0; i < n; i++) {
			candidates.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			int index = i;
			int p = sc.nextInt();
			int y = sc.nextInt();
			ArrayList list = candidates.get(i);
			list.add(y);
			ansLists.add(i, list);
			map.put(y,index);
		}

		for (int i = 0; i < n; i++) {
			ArrayList candlist = candidates.get(i);
			ArrayList anslist = new ArrayList<Integer>();
			Collections.sort(candlist);
			for (int j = 0; j < candlist.size(); j++) {
			int index = map.get(candlist.get(j));
			anslist.add(index);
			}
			ansLists.add(anslist);

		}
		
		
		
		for(int k=0;k<ansLists.size();k++){
			for(int j=0;j<ansLists.get(k).size();j++){
				String pindex = String.format("%06d", k);
				String jindex = String.format("%06d",j);
				String ansstr = pindex + jindex;
				System.out.println(ansstr);
			}
		}


		

	}

}
