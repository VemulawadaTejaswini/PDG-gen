import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		int n = sc.nextInt();
    		int m = sc.nextInt();

    		PriorityQueue<Work> pq = new PriorityQueue<>(n, new WorkComparator());
    		for (int i=0; i<n; i++) {
    			int a = sc.nextInt();
    			int b = sc.nextInt();
    			Work w = new Work(a, b);
    			pq.add(w);
    		}

    		Work[] wariate = new Work[m+1];
            int[] segment = new int[getMin2N(m+1)*2];
            for (int i=0; i<=m; i++) {
            	segment[segment.length/2-1+i] = i;
            }
            for (int i=segment.length/2+m; i<segment.length; i++) {
            	segment[i] = Integer.MAX_VALUE;
            }
            initSegTree(segment, 0);
            // printSegTree(segment);

    		int count = 0;
    		while (!pq.isEmpty() && count < m) {
    			Work w = pq.poll();
    			int wariateIndex = query(segment, w.a, m, 0, 0, segment.length/2-1);
    			if (wariateIndex != Integer.MAX_VALUE) {
    				wariate[wariateIndex] = w;
    				// System.out.println();
    				updateSegTree(segment, wariateIndex, Integer.MAX_VALUE);
    				// printSegTree(segment);
    				count++;
    			}
    		}

    		int sum = 0;
    		for (int i=0; i<wariate.length; i++) {
    			if (wariate[i] != null) {
    				sum += wariate[i].b;
    			}
    		}

    		System.out.println(sum);

    	} finally {
    		sc.close();
    	}
    }

    public static int getMin2N(int i) {
    	int n = 1;
    	while (n < i) {
    		n *= 2;
    	}

    	return n;
    }

    public static int initSegTree(int[] tree, int index) {
    	if (index >= tree.length/2-1) {
    		return tree[index];
    	} else {
    		tree[index] = Math.min(initSegTree(tree, index*2+1), initSegTree(tree, index*2+2));
    		return tree[index];
    	}
    }

    public static void updateSegTree(int[] tree, int index, int value) {
    	index = tree.length/2 - 1 + index;
    	tree[index] = value;
    	while (index > 0) {
    		index = (index - 1) / 2;
    		tree[index] = Math.min(tree[index*2+1], tree[index*2+2]);
    	}
    }

    public static int query(int[] tree, int from, int to, int nodeIndex, int nodeL, int nodeR) {
    	if (to < nodeL || nodeR < from) {
    		return Integer.MAX_VALUE;
    	}
    	if (from <= nodeL && nodeR <= to) {
    		return tree[nodeIndex];
    	}
    	int lResult = query(tree, from, to, nodeIndex*2+1, nodeL, (nodeL + nodeR) / 2);
    	int rResult = query(tree, from, to, nodeIndex*2+2, (nodeL + nodeR) / 2 + 1, nodeR);
    	return Math.min(lResult, rResult);
    }

    public static void printSegTree(int[] tree) {
    	final int minWidth = 11;
    	int width = (tree.length/2)*minWidth;
    	int index = 0;
    	int num = 1;
    	while (width >= minWidth) {
    		for (int i=0; i<num; i++) {
    			String format = "%" + width + "d";
    			System.out.print(String.format(format, tree[index+i]));
    		}
    		System.out.println();
    		index += num;
    		num *= 2;
    		width /= 2;
    	}
    }
}

class Work {
	public int a;
	public int b;
	public Work(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class WorkComparator implements Comparator<Work> {

	@Override
	public int compare(Work o1, Work o2) {
		if (o1.b > o2.b) {
			return -1;
		} else if (o1.b < o2.b) {
			return 1;
		} else {
			if (o1.a > o2.a) {
				return -1;
			} else if (o1.a < o2.a) {
				return 1;
			}
		}
		return 0;
	}
}

