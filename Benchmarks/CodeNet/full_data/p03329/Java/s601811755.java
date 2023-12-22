import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{

	static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(1);
		for(int i = 1;i < 9;i++){
			data.add((int)(Math.pow(6, i)));
		}
		for(int i = 1;i < 9;i++){
			data.add((int)(Math.pow(9, i)));
		}
		Collections.sort(data);
//		for(int i = 0;i < data.size();i++){
//			System.out.println(data.get(i));
//		}
		int p = 0;
		while(n >= data.get(p)){
			p++;
		}
		p--;
//		System.out.println("p "+p+" data "+data.get(p));
		dfs(n,p,0,data);
		System.out.println(ans);
		
	}
	static void dfs(int n,int p,int count,ArrayList<Integer> data){
	//	System.out.println(n);
		if(n < 0 || count >= ans){
			return;
		}
		if(n == 0){
			ans = Math.min(ans, count);
			return;
		}
		for(int i = p;i >= 0;i--){
			if(n-data.get(i) >= 0){
			dfs(n-data.get(i), i, count+1, data);
			}
		}
		
		
		
		
	}

}

class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

