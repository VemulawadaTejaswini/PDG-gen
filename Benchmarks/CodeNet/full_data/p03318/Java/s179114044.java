import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}

	public void solve(Scanner sc) {
		long k = Long.parseLong(sc.next());
		
		long index = 1;
		
		while(true) {
			int interval = 1;
			while(true) {
				boolean result = ((float)(index / calculateSum(index)) <= (float)((index + interval) / calculateSum(index + interval)));
				if(result) {
					long criteria = index + interval * 9;
					while(index<criteria) {
						if(k==0) return;
						System.out.println(index);
						index+=interval;
						k--;
					}
					break;
				} else {
					index += interval*9;
					interval *= 10;
				}
			}
		}
	}
	
	private long calculateSum(long target) {
		long result = target % 10;
		
		while(target > 0) {
			target /= 10;
			result += (target % 10);
		}
		
		return result;
	}
}