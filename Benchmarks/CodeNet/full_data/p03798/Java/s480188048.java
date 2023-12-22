import java.util.*;

class Main{
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		//処理
		//String[] pat = {"SS", "SW", "WS", "WW"};
		boolean[] bs = new boolean[s.length()];
		for(int i = 0; i < s.length(); i++){bs[i] = s.charAt(i) == 'o';}
		boolean[][] pat = {{true,true}, {true,false}, {false,true}, {false,false}};
		for(boolean[] mat : pat){
			ArrayList<Boolean> ans = new ArrayList<>();
			ans.add(mat[0]);ans.add(mat[1]);
			for(int i = 1; i < n-1; i++){
				ans.add((ans.get(i) == ans.get(i-1)) == bs[i]);
			}

			boolean ok = (ans.get(0) == bs[0]) == (ans.get(n-1) == ans.get(1)) && (ans.get(n-1) == bs[n-1]) == (ans.get(n-2) == ans.get(0));
			if(ok){
				for(int i = 0; i < n; i++){
					if(ans.get(i)) System.out.print('S');
					else System.out.print('W');
				}
				System.out.println();
				return;
			}
		}

		//出力
		System.out.println(-1);
	}
}
