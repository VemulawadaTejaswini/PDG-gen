import java.util.*;
public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numNode = sc.nextInt();
		int numEdge = sc.nextInt();
		connect = new ArrayList[numNode];
		for(int i = 0; i < numNode; i ++) {
			connect[i] = new ArrayList<>();
		}
		for(int i = 0; i < numEdge; i ++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			connect[a].add(b);
			connect[b].add(a);
		}

		// System.err.println();
		// for(int i = 0; i < numNode; i ++) {
		// 	for(int j = 0; j < connect[i].size(); j ++) {
		// 		System.err.print(connect[i].get(j)+" ");
		// 	}
		// 	System.err.println();
		// }

		if(numEdge % 2 != 0) { System.out.println(-1); return; }

		visited = new int[numNode];
		odd = new boolean[numNode];
		print = new StringBuilder();
		dfs(0, -1);
		System.out.println(print);
	}

	static ArrayList<Integer> connect[];
	static int visited[];
	static boolean odd[];
	static StringBuilder print;
	static void dfs(int crt, int parent) {
		// System.err.println("crt:"+crt);
		visited[crt] = 1;
		ArrayList<Integer> crtConnect = connect[crt];
		for(int child : crtConnect) {
			// System.err.println("child:"+child);
			if(child == parent || visited[child] == 1) {
				continue;
			}else if(visited[child] == 2) {
				print.append((crt + 1)+" "+(child + 1)+"\n");
				odd[crt] = !odd[crt];
			}else {
				dfs(child, crt);
				if(odd[child]) {
					print.append((child + 1)+" "+(crt + 1)+"\n");
					odd[child] = !odd[child];
				}else {
					print.append((crt + 1)+" "+(child + 1)+"\n");
					odd[crt] = !odd[crt];
				}
			}
		}
		visited[crt] = 2;
	}
}