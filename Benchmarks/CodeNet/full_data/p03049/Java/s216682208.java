import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] S = new String[N];
		int cnt = 0;
		for(int i = 0;i < N;i++){
			S[i] = sc.nextLine();
			if(S[i].contains("AB")){
				cnt++;
			}
		}
		sc.close();
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for(int i = 0;i < N;i++){
			if(S[i].startsWith("B") && S[i].endsWith("A")){
				c1++;
			}else if(S[i].startsWith("B") && !S[i].endsWith("A")){
				c2++;
			}else if(!S[i].startsWith("B") && S[i].endsWith("A")){
				c3++;
			}
		}
		if(c1 == 0){
			cnt += Math.min(c2, c3);
		}else if(c1 != 0 && c2 + c3 > 0){
			cnt += c1 + Math.min(c2, c3);
		}else if(c1 != 0 && c2 + c3 == 0){
			cnt += c1 -1;
		}
		System.out.println(cnt);
	}
}