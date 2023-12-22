
import java.util.Scanner;

public class Sequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < n; i++){
			num[i] = scanner.nextInt();
		}
		int countP = exe(n, num, 1);
		int countM = exe(n, num, -1);
		System.out.println(countP > countM ? countM: countP);

	}
	private static int exe(int n, int[] num, int sig){
		int count = 0;
		int[] ans = new int[n];
		ans[0] = sig * num[0];
		for(int i = 0; i < num.length - 1; i++){
			int sa = sa(ans, num[i + 1]);
			ans[i + 1] = num[i + 1] + sa;
			if(plusCheck(ans)){
				count++;
				ans[ans.length - 1] = addOne(ans[ans.length - 1]);
			}
			count += Math.abs(sa);
		}
		return count;
	}
	private static boolean plusCheck(int[] num){
		int total = 0;
		for(int n: num){
			total += n;
		}
		return total == 0;
	}
	private static int addOne(int num){
		int sig = (int)Math.signum(num);
		return sig * (Math.abs(num) + 1);
	}
	private static int sa(int[] left, int right){
		int total = 0;
		for(int num : left){
			total += num;
		}
		int sigTotal = (int)Math.signum(total);
		int sigWa    = (int)Math.signum(total + right);
		if(sigTotal != sigWa){
			return 0;
		}
		return (-sigTotal - total) - right;
	}

}
