import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),Q = sc.nextInt();
		String S = sc.next();
		int[] res = new int[Q];
		
		for(int i=0;i<N;i++) {
			int beg = sc.nextInt(), end = sc.nextInt();
			String s = S.substring(beg-1,end);
			int count = 0;
			
			for(int n = 0;n<s.length()-1;n++) {
				char c = s.charAt(n);
				if(c=='A'&&s.charAt(n+1)=='C') {
				count++;
				}
			}
			res[i]=count; 
			System.out.println(count);
		}
		
		
		}


}