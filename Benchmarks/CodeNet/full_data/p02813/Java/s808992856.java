import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[] P = new int[N];
			int[] Q = new int[N];
			StringBuffer p = new StringBuffer();
			StringBuffer q = new StringBuffer();
			StringBuffer start = new StringBuffer();
			for(int i = 1;i<=N;i++) {
				start.append(i);
			}
			
			for(int i =0;i<N;i++) {
				P[i] = scan.nextInt();
				p.append(P[i]);
			}
			
			for(int i =0;i<N;i++) {
				Q[i] = scan.nextInt();
				q.append(Q[i]);
			}
			
			String s = start.toString();
			String A =p.toString(); 
			String B =q.toString(); 
			int a=0;
			int b=0;
			int count = 1;
			while (true) {
				 // System.out.println(s);
				  if(s.equals(A))a=count;
				  if(s.equals(B))b=count;
				  s = nextPermutation(s);
				  count++;
				  if (s.equals("Final")) break;
				  }
			
			System.out.println(Math.abs(a-b));
			
			
			
			
			
			
		}
		
		
	}
	
	
	
	private static String nextPermutation (String s) {
		/*入力した文字列(数列、英語小文字、英語大文字)の次の順番を返すメソッド
		 * String s = "ABC";
		 * while (true) {
		 * System.out.println(s);
		 * s = nextPermutation(s);
		 * if (s.equals("Final")) break;
		 * }
		 * とmainメソッド に書けばN文字の文字列をN!文小さい物から順に列挙することができる*/

		ArrayList<Character> list = new ArrayList<>();
		for (int i=0; i<s.length(); i++) list.add(s.charAt(i));

		int pivotPos = -1;
		char pivot = 0;
		for (int i=list.size()-2; i>=0; i--) {
			if (list.get(i) < list.get(i+1)) {
				pivotPos = i;
				pivot = list.get(i);
				break;
			}
		}

		if (pivotPos==-1 && pivot==0) return "Final";

		int L = pivotPos+1, R = list.size()-1;
		int minPos = -1;
		char min = Character.MAX_VALUE;
		for (int i=R; i>=L; i--) {
			if (pivot < list.get(i)) {
				if (list.get(i) < min) {
					min = list.get(i);
					minPos = i;
				}
			}
		}

		Collections.swap(list, pivotPos, minPos);
		Collections.sort(list.subList(L, R+1));

		StringBuilder sb = new StringBuilder();
		for (int i=0; i<list.size(); i++) sb.append(list.get(i));

		return sb.toString();

	}
	
	
	
	

}
