import java.util.ArrayList;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long N = scan.nextInt();
		long X = scan.nextInt();
		ArrayList<Long> data = new ArrayList<Long>();		
		boolean flag = false;
		for(int i=0;i < N;i++){
			long num = scan.nextInt();
			if(num <= X || flag == true){
				data.add(num);
			}else{
				data.add(X);
				flag = true;
				data.add(num);

			}
		}
		
		

		long key = data.get(1)-data.get(0);
		for(int i= 1;i < N-1;i++){
			long num = data.get(i+1)-data.get(i);
			long big = Math.max(num, key);
			long small = Math.min(num, key);

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
