import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<>();

		// 文字列の入力
		for(int i=0;i<n;i++)A.add(sc.nextInt());
		Collections.sort(A);

		for(int i=n-1;i>0;i--){
			int num = A.size()-1;
			if(i%2==0){
				int s = A.get(0);
				int t = A.get(num);
				System.out.println(s+" "+t);
				A.remove(num);
				A.remove(0);
				A.add(0,s-t);
			} else {
				int s = A.get(num);
				int t = A.get(0);
				System.out.println(s+" "+t);
				A.remove(num);
				A.remove(0);
				A.add(s-t);
			}
		}

		// 出力
		System.out.println(A.get(0));
	}
}