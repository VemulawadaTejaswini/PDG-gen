import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] array = new int[3][n];
		for(int i = 0; i < 3; i++){
			for(int l = 0; l < n; l++){
				array[i][l] = sc.nextInt();
			}
			Arrays.sort(array[i]);
		}
		int count = 0;
		for(int i =0; i < n; i++){
			int b = array[1][i];
			int aCount = 0;
			for(int l =0; l < n; l++){
				int a = array[0][l];
				if(b > a) aCount++;
			}
			int cCount = 0;
			for(int l =0; l < n; l++){
				int c = array[2][l];
				if(b < c) cCount++;
			}
			count += aCount * cCount;
		}
		System.out.println(count);
	}
}