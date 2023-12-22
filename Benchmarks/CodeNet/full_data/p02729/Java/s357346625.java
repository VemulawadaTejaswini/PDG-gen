import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = sc.nextInt();  //偶数の個数
		int odd = sc.nextInt();  //奇数の個数
		int total = 0;

		if(even>=2 && odd >=2) {
			total = even*(even-1)/2 + odd*(odd-1)/2;
		}
		else if(even>=2 && odd <2) {
			total = even*(even-1)/2;
		}
		else if(even<2 && odd>=2) {
			total = odd*(odd-1)/2;
		}
		System.out.print(total);
	}
}
