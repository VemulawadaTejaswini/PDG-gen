import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int withdraw[] = {1, 6, 9, 36, 81, 216, 729, 1296, 6561, 7776, 46656, 59049};
		int i = withdraw.length - 1;
		int Ans = 0;
		while (N > 0 && i >= 0) {
			if (N - withdraw[i] >= 0) {
				N -= withdraw[i];
				Ans++;
			} else {
				i--;
			}
		}
		System.out.println(Ans);
	}
}