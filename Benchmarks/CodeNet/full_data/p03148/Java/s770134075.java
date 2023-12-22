import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static class Group {
		int neta;
		long sushi;
		
		public Group(int neta, long sushi) {
			this.neta = neta;
			this.sushi = sushi;
		}

		public int getNeta() {
			return neta;
		}

		public void setNeta(int neta) {
			this.neta = neta;
		}

		public long getSushi() {
			return sushi;
		}

		public void setSushi(long sushi) {
			this.sushi = sushi;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] neta = new int[n];
		Long[] sushi = new Long[n];
		Group[] group = new Group[n];
		for(int i=0; i<n; i++) {
			neta[i] = sc.nextInt();
			sushi[i] = sc.nextLong();
			group[i] = new Group(neta[i], sushi[i]);
		}
		int max = Integer.MIN_VALUE;
		List<List<Group>> lists = new ArrayList<List<Group>>();
		List<Group> list = new ArrayList<Group>();
		dfs(lists, list, group, k, 0);
		for(int i=0; i<lists.size(); i++) {
			int sum = 0;
			int x = 0;
			List<Group> tmpList = lists.get(i);
			List<Integer> sub = new ArrayList<Integer>();
			for(int j=0; j<tmpList.size(); j++) {
				sum += tmpList.get(j).getSushi();
				if(!sub.contains(tmpList.get(j).getNeta())) {
					sub.add(tmpList.get(j).getNeta());
				}
				x = sub.size()*sub.size();
			}
			max = Math.max(max, sum + x);
		}
		System.out.println(max);
	}

	private static void dfs(List<List<Group>> lists, List<Group> list, 
			Group[] group, int k, int start) {
		if(start == k) {
			lists.add(new ArrayList<Group>(list));
		}else {
			for(int i=start; i<group.length; i++) {
				if(list.contains(group[i])) {
					continue;
				}
				list.add(group[i]);
				dfs(lists, list, group, k, i+1);
				list.remove(list.size()-1);
			}
		}
	}
}
