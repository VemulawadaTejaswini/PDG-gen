import java.util.*;

public class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Color[] colors = new Color[n - 1];
		ArrayList<ArrayList<Color>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    graph.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    colors[i] = new Color(a, b);
		    graph.get(a).add(colors[i]);
		    graph.get(b).add(colors[i]);
		}
		paint(0, 0, 0, graph);
		StringBuilder sb = new StringBuilder();
		int max = 0;
		for (Color c : colors) {
		    sb.append(c.color).append("\n");
		    max = Math.max(max, c.color);
		}
		System.out.println(max);
		System.out.print(sb);
	}
	
	static class Color {
	    int left;
	    int right;
	    int color;
	    public Color(int left, int right) {
	        this.left = left;
	        this.right = right;
	    }
	    
	    public String toString() {
	        return left + ":" + right + ":" + color;
	    }
	}
	
	static void paint(int idx, int parent, int without, ArrayList<ArrayList<Color>> graph) {
	    int num = 0;
	    for (Color c : graph.get(idx)) {
	        int next;
	        if (c.left == idx) {
	            next = c.right;
	        } else {
	            next  = c.left;
	        }
	        if (next == parent) {
	            continue;
	        }
	        num++;
	        if (num == without) {
	            num++;
	        }
	        c.color = num;
	        paint(next, idx, num, graph);
	    }
	}
}
