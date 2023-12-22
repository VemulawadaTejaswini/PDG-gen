
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());//int型
		int[] a = new int[N];//int型
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(sc.next());
			al.add(a[i]);
		}
		sc.close();
		int ans = 1;
		for(int i = 0;i<N; i++){
			ArrayList<Integer> a2 = (ArrayList<Integer>) al.clone();
			a2.remove(i);
			ans = Math.max(ans, gcdarr(a2));
		}
		System.out.println(ans);
	}

	public static int gcd(int a, int b){
		if(b==0){
			return a;
		}
		else{
			return gcd(b,a%b);
		}
	}
	public static int gcdarr(ArrayList<Integer> a){
		int ans = a.get(0);
		for(int i:a){
			ans=gcd(ans,i);
		}
		return ans;
	}
}
