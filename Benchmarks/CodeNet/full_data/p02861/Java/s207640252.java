import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			int N = scan.nextInt();
			int[]x  = new int[N];
			int[]y  = new int[N];
			
			for(int i = 0;i<N;i++) {
				x[i] = scan.nextInt();
				y[i] = scan.nextInt();
			}
			
			StringBuffer A = new StringBuffer();
			for(int i = 1;i<=N;i++) {
				A.append(i);
			}
			
			String s = A.toString();
		double goukei = 0;
			BigDecimal big = new BigDecimal(0.0);
			
			  while (true) {
			  //System.out.println(s);
				double kyori = 0;  
				for(int i = 0;i<s.length()-1;i++) {  
					int a = Integer.valueOf(s.substring(i, i+1));//現在地
					int b = Integer.valueOf(s.substring(i+1, i+2));//行先
					
					kyori+=Math.sqrt(Math.pow(x[a-1]-x[b-1], 2)+Math.pow(y[a-1]-y[b-1], 2));
					
					
				}
				
				//System.out.println(kyori);
				goukei+=kyori;
				  
				  
				  
			  s = nextPermutation(s);
			  if (s.equals("Final")) break;
			  }
			  
			  BigDecimal kai = BigDecimal.valueOf(kaijyou(N));
			big.divide(kai,7,RoundingMode.HALF_UP);
			String str = big.toPlainString();
			
			System.out.println(goukei/(double)kaijyou(N));
			
			
			
			
			
			
		}
	}
		
		
		
		
		private static int kaijyou(int n) {
			if(n==1)return 1;
			else return n*kaijyou(n-1);
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
