import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		String S = sc.next();
		sc.close();

		int[] start = new int[N+1];
		int[] end = new int[N+1];

		int scount = 0;
		int ecount = 0;

		if(S.substring(0, 1).equals("0")){
			start[0] = 0;
			scount++;
		}
		for(int i = 0 ; i < S.length()-1; i++){
			if(S.substring(i, i+1).equals("1") && S.substring(i+1,i+2).equals("0")){
				start[scount] = i+1;
				scount++;
			}
			if(S.substring(i, i+1).equals("0") && S.substring(i+1,i+2).equals("1")){
				end[ecount] = i;
				ecount++;
			}
		}

		for(int i = 0 ; i < S.length(); i++){
			//System.out.println(start[i]);
			//System.out.println(end[i]);
		}

		int ans = 0;
		int count = 0;
		for(int i = 0 ; i < S.length(); i++){
			int p = start[K+count];
			if(start[K+count] == 0){
				p = S.length();
			}
			//System.out.println(p-i);

			if(ans < p-i){
				ans = p-i;
			}

			if(end[count] == 0){
				break;
			}

			i = end[count];
			count++;

		}

		System.out.println(ans);

	}
}