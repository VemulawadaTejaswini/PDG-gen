import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(K);
		}
		
		for(int j = 0; j < Q; j++) {
			int n = sc.nextInt();
			list = check(n,list);
		}
		
		for(int k = 0; k < N; k++) {
			if(list.get(k) > 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
	public static ArrayList<Integer> check(int n,ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			if(i != n-1) {
				list.set(i, list.get(i)-1);
			}
		}
		return list;
	}
}