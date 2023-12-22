import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[][] = new int[M][2];
		for(int i = 0; i < M; i++) {
			a[i][0] = sc.nextInt() - 1;
			a[i][1] = sc.nextInt() - 1;
		}
		LinkedList list[] = new LinkedList[N];
		for(int i = 0; i < N; i++) {
			list[i] = new LinkedList();
		}
		for(int i = 0; i < M; i++) {
			list[a[i][0]].add(a[i][1]);
			list[a[i][1]].add(a[i][0]);
		}
		
		Boolean flag[] = new Boolean[list.length];
		for(int i = 0; i < list.length; i++) {
			flag[i] = false;
		}
		int ans = 0;
		ans = GraphDFS(list, 0 , flag, ans);
		System.out.println(ans);
	}
	
	public static int GraphDFS(LinkedList list[], int now, Boolean flag[], int ans) {
		flag[now] = true;	
		for(int i = 0; i < list[now].size(); i++) {
			if(!flag[list[now].get(i)]) {
				ans = GraphDFS(list, list[now].get(i), flag, ans);
			}
		}
		
		if(!Arrays.asList(flag).contains(false)) {
			ans++;
		}
		
		flag[now] = false;
		return ans;
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
