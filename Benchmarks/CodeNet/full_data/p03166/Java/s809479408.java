
import java.util.*;

public class Pg
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	String[] temp = in.nextLine().split(" ");
	int N = Integer.parseInt(temp[0]);
	int M = Integer.parseInt(temp[1]);
	ArrayList<Integer>[] graph = new ArrayList[N+1];
	for (int i = 0; i <= N; i++) graph[i] = new ArrayList<>();
	for (int i = 0; i < M; i++) {
	    temp = in.nextLine().split(" ");
	    int from = Integer.parseInt(temp[0]);
	    int to = Integer.parseInt(temp[1]);
	    graph[to].add(from);
	}
	in.close();
	int[] mem = new int[N+1];
	Arrays.fill(mem, -1);
	int res = 0;
	for (int i = 1; i <= N; i++) {
	    res = Math.max(res, longest(i, mem, graph));
	}
	System.out.println(res);
	
    }

    public static int longest(int i, int[] mem, ArrayList<Integer>[] graph) {
	if (mem[i] == -1) {
	    int res = 0;
	    for (int j : graph[i]) {
		res = Math.max(res, longest(j, mem, graph)+1);
	    }
	    mem[i] = res;
	}
	return mem[i];
    }
}
