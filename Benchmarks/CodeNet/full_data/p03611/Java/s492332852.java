import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int answer =0;
		for(int i=0; i< n;i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for(int i =array[0]; i <= array[array.length -1] +1;i++) {
			int tmpAnswer = 0;
			for(int j=0; j< n;j++) {
				if(array[j] == i || array[j]-1 == i || array[j]+1 == i) {
					tmpAnswer++;
				}else if(array[j] > i +1) {
					break;
				}
			}
			if(tmpAnswer > answer) {
				answer = tmpAnswer;
			}
		}
		System.out.print(answer);
	}
}