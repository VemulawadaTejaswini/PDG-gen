import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int placeOfOne = 0;
		int[] numbers = new int[n];
		for(int i=0;i<n;i++) {
			numbers[i] = in.nextInt();
			if(numbers[i]==1) {
				placeOfOne=i;
			}
		}
		int before = placeOfOne;
		int after = n - placeOfOne - 1;
		
		int amari = before%(k-1) + after%(k-1);
		int kaisuu = before/(k-1) + after/(k-1);
		if(amari>=k) {
			kaisuu += 2;
		}else if(amari>0) {
			kaisuu++;
		}
		System.out.println(kaisuu);
	}
}