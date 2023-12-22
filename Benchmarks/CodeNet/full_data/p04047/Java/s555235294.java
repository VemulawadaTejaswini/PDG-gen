import java.util.Scanner;
import java.util.Arrays;

class Main{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] l = new int[n*2];
		
		for(int i = 0; i < n*2; i++){
			l[i] = in.nextInt();
		}
		Arrays.sort(l);
		int sum = 0;
		for(int i = 0; i < n; i++){
			sum += l[i*2];
		}

		System.out.println(sum);
		in.close();

	}

}