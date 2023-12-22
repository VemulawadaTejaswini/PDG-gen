import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long ans = 0;//答え
		int n = sc.nextInt();
		Map<String, Integer> s = new HashMap<String,Integer>();//文字列と個数のマップ
		String sn;//読み込んだ文字列
 		String si;//並べ替えた文字列
		char sm[] = new char[10];//並べ替え用
		
		
		for(int i = 0;i < n;i++) {
			sn = sc.next();
			//読み込んだ文字列の並べ替え
			sm = sn.toCharArray();
			Arrays.sort(sm);
			si = new String(sm);
			
			if(s.containsKey(si)) {
				//同じものがあったら
				int m = s.get(si);
				ans += m+1;
				s.put(si, m + 1);
				
			}else {
				//なかったら
				s.put(si, 0);
			}
		}
		System.out.println(ans);
	}
}
