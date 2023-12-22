import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();
		int l = s.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = l + i ;
		}
		int sum = Arrays.stream(array).sum();
		int res = calcNextSum(array,0);
		int diffMin = Math.abs(sum-calcNextSum(array,0));
		for(int i=1;i<array.length;i++) {
			int nextSum = calcNextSum(array,i);
			int diff=Math.abs(sum-nextSum);
			if(diffMin>diff) {
				diffMin = diff;
				res = nextSum;
			}
		}
		System.out.println(res);
	}
	public static int calcNextSum(int[] array, int eat) {
		int nextSum=0;
		for(int i=0;i<array.length;i++) {
			if(i!=eat) {
				nextSum+=array[i];
			}
		}
		return nextSum;
	}
}