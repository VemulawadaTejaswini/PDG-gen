import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int bit = 0;
		for(int i = 0; i < n; i++) {
			a[i] = bit|sc.nextInt();
		}
		int maxBit = 0;
		for(int i = 0;i < n; i++) {
			maxBit += Integer.numberOfTrailingZeros(a[i]);
			}
		System.out.println(maxBit);
		}
	}