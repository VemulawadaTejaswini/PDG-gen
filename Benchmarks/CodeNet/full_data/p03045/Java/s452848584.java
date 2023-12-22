import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		List<int[]> list = new ArrayList<>();
		for(int i=0;i<m;i++) {
			int[] tmp = new int[3];
			tmp[0] = in.nextInt();
			tmp[1] = in.nextInt();
			tmp[2] = in.nextInt();
			list.add(tmp);
		}
		int[] uft = new int[n+1];
		for(int i=1;i<=n;i++) {
			uft[i] = i;
		}
		for(int i=0;i<list.size();i++) {
			int[] tmp = list.get(i);
			union(uft,tmp[0],tmp[1]);
		}
		boolean[] used = new boolean[n+1];
		int ans = 0;
		for(int i=1;i<=n;i++) {
			if(!used[find(uft,i)]) {
				used[find(uft,i)] = true;
				ans++;
			}
		}
		System.out.println(ans);
		

	}
	//return root node idx O(a(N)) ( O(1)<O(a(N))<O(logN) )
	public static int find(int[] tree,int idx) {
		if(tree[idx]==idx) return idx;
		else return tree[idx] = find(tree,tree[idx]);
	}
	
	//union idx2 tree to idx1 tree O(a(N))
	public static void union(int[] tree,int idx1,int idx2) {
		int root1 = find(tree,idx1);
		int root2 = find(tree,idx2);
		tree[root2] = root1;
	}

}
