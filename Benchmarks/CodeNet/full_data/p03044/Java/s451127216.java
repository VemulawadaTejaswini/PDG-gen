import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int u[] = new int[N - 1];
		int v[] = new int[N - 1];
		int w[] = new int[N - 1];
		
		
		LinkedList list[] = new LinkedList[N];
		for(int i = 0; i < N; i++) {
			list[i] = new LinkedList();
		}
		
		for(int i = 0; i < N - 1; i++) {
			u[i] = sc.nextInt() - 1;
			v[i] = sc.nextInt() - 1;
			w[i] = sc.nextInt();
			if(w[i] % 2 == 1) {
				list[u[i]].add(v[i]);
				list[v[i]].add(u[i]);
			}
		}
		int ans[] = new int[N];
		Arrays.fill(ans, -1);
		ans[0] = 1;
		for(int i = 0; i < N; i++) {
			if(list[i].size() > 0) {
				for(int j = 0; j < list[i].size(); j++) {
					//System.out.println("tes");
					if(ans[i] == 1 && ans[list[i].get(j)] == -1) {
						ans[list[i].get(j)] = 0;
					} else if(ans[list[i].get(j)] == -1){
						ans[list[i].get(j)] = 1;
					}
				}
			} else {
				ans[i] = 1;
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.println(ans[i]);
		}
	}
}


class LinkedList {
	ArrayList<Integer> link = new ArrayList<Integer>();
	public void add(int vertex) {
		link.add(vertex);
	}

	public int get(int i){
		return link.get(i);
	}
	
	public void remove(int vertex) {
	}
	
	public void view() {
		for(int i = 0; i < link.size(); i++) {
			System.out.println(link.get(i));
		}
	}
	
	public boolean linked(int vertex) {
		if(link.contains(vertex)){
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return link.size();
	}
}
