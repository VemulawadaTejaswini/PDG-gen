import java.util.ArrayList;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		ArrayList<Integer> data = new ArrayList<Integer>();		
		boolean flag = false;
		for(int i=0;i < N;i++){
			int num = scan.nextInt();
			if(num <= X || flag == true){
				data.add(num);
			}else{
				data.add(X);
				flag = true;
				data.add(num);

			}
		}
		
		

		int key = data.get(1)-data.get(0);
		for(int i= 1;i < N-1;i++){
			int num = data.get(i+1)-data.get(i);
			int big = Math.max(num, key);
			int small = Math.min(num, key);

			if(big % small != 0){
				key = 1;
				System.out.println(1);
				return;
			}else if(key > num){
				key = num;
				
			}
		}
		System.out.println(key);

	}
}
