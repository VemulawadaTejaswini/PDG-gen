import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		
		int count = 0;
		for(int i=0; i<a+1; i++) {
			for(int j=0; j<b+1; j++) {
				for(int k=0; k<c+1; k++) {
					int sum = a*i*500 + b*j*100 + c*k*50;
					if(sum == x) {
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}
