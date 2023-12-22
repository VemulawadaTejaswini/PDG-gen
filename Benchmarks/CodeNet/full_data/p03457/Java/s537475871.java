import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = {0,0,0};
		boolean b = true;
		for(int i = 0; i < n; i++){
			int[] nextArray = new int[3];
			for(int j = 0; j < 3; j++){
				nextArray[j] = sc.nextInt();
			}
			int t = nextArray[0] - array[0];
			int length = Math.abs(nextArray[1] - array[1]) + Math.abs(nextArray[2] - array[2]);
			if(!(b = t >= length && (t - length) % 2 == 0)) break;
		}
		System.out.println(b ? "Yes" : "No");
	}
}
