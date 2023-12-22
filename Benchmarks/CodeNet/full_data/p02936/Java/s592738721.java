import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int q = sc.nextInt();
//		tree = new ArrayList<TreeNode>();
		
//		for(int i = 0;i < n;i++){
//			TreeNode node = new TreeNode(i, 0);
//			tree.add(node);
//		}
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0;i < n-1;i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
//			tree.get(a).childlen.add(tree.get(b));			//子ノードの追加
//			tree.get(b).childlen.add(tree.get(a));			//子ノードの追加
			map.put(b, a);
		}
		
		long[] data = new long[n];
 		for(int i = 0;i < q;i++){
			int p = sc.nextInt()-1;
			int x = sc.nextInt();
//			tree.get(p).sum += x;
			data[p] += x;
			
		}
		

		
		System.out.println(data[0]);
 		
		for(int i = 1;i < n;i++){
			data[i] += data[map.get(i)];
			System.out.println(data[i]);
		}
		sc.close();





	}


}




