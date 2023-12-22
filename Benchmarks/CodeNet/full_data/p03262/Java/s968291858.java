import java.util.Arrays;
import java.util.Scanner;


class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		int[] data = new int[N+1];
		for(int i=0;i < N;i++){
			data[i] = scan.nextInt();
		}
		data[N] = X;
		Arrays.sort(data);

		int key = data[1]-data[0];		
		for(int i= 1;i < N-1;i++){
			int num = data[i+1]-data[i];
			int big = Math.max(num, key);
			int small = Math.min(num, key);
			if(num == key){

			}else if(big % small != 0){
				System.out.println(1);
				return;
			}else if(key > num){
				key = num;	
			}
		}
		System.out.println(key);

	}
}
