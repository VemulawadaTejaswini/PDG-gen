import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static char winHand(char c){
		if(c == 'r'){
			return 'p';
		}else if(c == 's'){
			return 'r';
		}else{
			return 's';
		}
	}
	static char exclude(char c1 , char c2){
		char arr[] = {'p' , 'r' , 's'};
		for(char c : arr){
			if(c == c1 || c == c2){
				continue;
			}
			return c;
		}
		return 'N';
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int R = sc.nextInt();
		int S = sc.nextInt();
		int P = sc.nextInt();
		String T = sc.next();
		char prev[] = new char[N];
		long result = 0;
		for(int i = 0 ; i < N ; ++i){
			char c = T.charAt(i);
			char w = winHand(c);
			char cur = w;
			if(i >= K){
				if(prev[i - K] == w){
					if(i + K < N){
						char w2 = winHand(T.charAt(i + K));
						cur = exclude(w, w2);
					}else{
						cur = exclude(w, w);
					}
				}
			}else{
				
			}
			prev[i] = cur;
			if(cur == w){
				if(w == 'r') result += R;
				if(w == 's') result += S;
				if(w == 'p') result += P;
			}
		}
//		System.out.println(Arrays.toString(prev));
		System.out.println(result);
	}
}
