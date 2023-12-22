
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static int n;
	public static int[] pos;
	public static List<Integer>[] node;

	public static boolean Check(int num, int here, int parent) {
		if(node[here].contains(num))
			return true;
		else {
			boolean check = false;
			for(Integer e : node[here]) {
				if(e != parent)
					check = check || Check(num, e, here);
			}
			return check;
		}
	}

	public static void Add(int num, int here, int parent) {
		pos[here] += num;
		for(Integer e : node[here]) {
			if(e != parent)
				Add(num, e, here);
		}
	}

	public static void Calc(int num, int here, int parent) {
		if(pos[here] > num) {
			pos[here] = num - (pos[here] - num);
		}
		for(Integer e : node[here]) {
			if(e != parent)
				Calc(num, e, here);
		}
	}

	public static int[] dep;
	public static boolean[] flag;

	public static void Depth(int here, int parent) {
		flag[here] = true;
		for(Integer e : node[here]) {
			if(e != parent) {
				dep[e] = Math.min(dep[e], dep[here] + 1);
				if(!flag[e])
					Depth(e, here);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		pos = new int[n + 1];
		node = new List[n + 1];
		for(int i = 0; i < n + 1; i++) {
			pos[i] = Integer.MAX_VALUE;
			node[i] = new ArrayList<>();
		}
		boolean judge = true;
		for(int i = 1; i < n + 1; i++) {
			String s = sc.next();
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == '1' && i < j + 1) {
					int posj = j + 1;
					if(Check(i, posj, 0)) {
						if(Math.abs(pos[i] - pos[posj]) % 2 == 0) {
							judge = false;
							break;
						} else {
							if(i > posj) {
								int tmp = i;
								i = posj;
								posj = tmp;
							}
							Calc((posj - i) / 2 + 1, i, 0);
						}
					} else {
						if(pos[i] == Integer.MAX_VALUE)
							pos[i] = 0;
						if(pos[posj] == Integer.MAX_VALUE)
							pos[posj] = 0;
						Add(pos[i] + 1, posj, 0);
						node[i].add(posj);
						node[posj].add(i);
					}
				}
			}
			if(!judge)
				break;
		}
		dep = new int[n + 1];
		flag = new boolean[n + 1];
		if(judge) {
			int ans = 0;
			for(int i = 1; i < n + 1; i++) {
				for(int j = 1; j < n + 1; j++) {
					dep[j] = Integer.MAX_VALUE;
					flag[j] = false;
				}
				dep[i] = 1;
				Depth(i, 0);
				int max = 0;
				for(int j = 1; j < n + 1; j++) {
					max = Math.max(max, dep[j]);
				}
				ans = Math.max(ans, max);
			}
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}
	}

}
