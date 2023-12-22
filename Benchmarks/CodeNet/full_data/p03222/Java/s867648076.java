
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static Set<boolean[]> amida = new HashSet<>();
	public static boolean[] amicre;
	public static int H, W, K;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		K = sc.nextInt();
		amicre = new boolean[H * W];
		amida.removeIf(o -> filter(o));
		long count = 0;
		for(boolean[] ami : amida) {
			if(K == play(ami)) {
				count++;
			}
		}
		System.out.println(count % 1000000007);
	}

	public static int play(boolean[] ami) {
		int tmp = 1;
		while(tmp <= H * W) {
			if(ami[tmp - 1]) {
				tmp--;
			} else if(ami[tmp]) {
				tmp++;
			}
			tmp += W;
		}
		int ret = 0;
		if(tmp % W == 0) {
			ret = W;
		} else {
			ret = tmp % W;
		}
		return ret;
	}

	public static boolean filter(boolean[] ami) {
		boolean ans = false;
		for(int i = 0; i < H * W; i += W) {
			if(ami[i]) {
				ans = true;
				break;
			}
		}
		if(!ans) {
			for(int i = 1; i < H * W; i++) {
				if(ami[i] && (ami[i - 1] || ami[i + 1])) {
					ans = true;
					break;
				}
			}
		}
		return ans;
	}

	public void create(int i) {
		if(i <= H * W) {
			amicre[i] = true;
			create(i + 1);
			amicre[i] = false;
			create(i + 1);
		} else {
			amida.add(amicre);
		}
	}

}
