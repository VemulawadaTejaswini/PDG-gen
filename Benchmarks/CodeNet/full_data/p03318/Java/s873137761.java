import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int k=1;
		int output = 1; 
		while(k<=K) {
			for(int i = output; i < Integer.MAX_VALUE ; i++) {
				if((int)Math.pow(10, countNineNumber(i))*digitSum(i) >= i) {
					output = i+1;
					System.out.println(i);
					k++;
					break;
				}
			}
		}

	}
	public static double countNineNumber(int n) {
		int count = 0;
		while(n!=0) {
			if(n%10==9) {
				count ++;
			}else {
				break;
			}
			n /= 10;
		}
		return count;
	}
	public static int digitSum(int n) {
		int sum = 0;
		while(n != 0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}

}