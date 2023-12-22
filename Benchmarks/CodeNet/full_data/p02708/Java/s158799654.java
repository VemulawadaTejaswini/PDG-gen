import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] list = new int[n];
		int result = 0;
		list[0] = 0;
		for(int i = 1; i < n; i++){
			list[i] = list[i-1] + i;
		}
		for(int i = k; i < n+1; i++){
			int tmp = calcNumOfCombination(n+1,i);
			result = result + tmp - list[i - k];
		}
		result++;
		System.out.println(result);
	}

	public static int calcNumOfCombination(int n, int r){
        int num = 1;
        for(int i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        return num;
    }
}
