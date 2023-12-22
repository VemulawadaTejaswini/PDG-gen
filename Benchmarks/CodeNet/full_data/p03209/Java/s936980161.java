import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //整数の入力
		int x = sc.nextInt();
		System.out.println(count(n, x));
		
	}
	
	public static int count(int level, int end) {
		int total = 0;
		if (level == 0) {
			return 1;
		}
		end--;
		if (end <= 0) {
			return total;
		}
		total += count(level - 1, end);
		end -= size(level - 1);
		if (end <= 0) {
			return total;
		}
		end--;
		total++;
		if (end <= 0) {
			return total;
		}
		total += count(level - 1, end);
		return total;
	}
	
	public static int size(int level) {
		if (level == 0) {
			return 1;
		} else {
			return size(level - 1) * 2 + 3;
		}
	}
}