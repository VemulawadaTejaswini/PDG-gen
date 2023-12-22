import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numNode = sc.nextInt();
		int numEdge = sc.nextInt();
		ArrayList<ArrayList<Integer>> go = new ArrayList<>();
		for(int i = 0; i < numNode; i ++) {
			go.add(new ArrayList<Integer>());
		}
		for(int i = 0; i < numEdge; i ++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			go.get(a).add(b);
		}
		int start = sc.nextInt() - 1;
		int goal = sc.nextInt() - 1;

		long need[] = new long[numNode];
		for(int i = 0; i < numNode; i ++) {
			need[i] = -1;
		}
		boolean visited[][] = new boolean[numNode][3];
		for(int i = 0; i < numNode; i ++) {
			for(int j = 0; j < 3; j ++) {
				visited[i][j] = false;
			}
		}

		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.addFirst(start);

		long count = 0;
		while (!stack.isEmpty()) {
			int size = stack.size();
			for(int a = 0; a < size; a ++) {
				int crt = stack.removeFirst();
				if(visited[crt][(int)(count % 3)]) { continue; }
				if(count % 3 == 0) { need[crt] = need[crt] >= 0 ? Math.min(need[crt], count / 3) : count / 3; }
				visited[crt][(int)(count % 3)] = true;
				for(int i = 0; i < go.get(crt).size(); i ++) {
					stack.addLast(go.get(crt).get(i));
				}
			}
			if(need[goal] >= 0) { break; }
			count ++;
		}

		System.out.println(need[goal]);
	}
}