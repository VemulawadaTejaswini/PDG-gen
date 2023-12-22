
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner scan = new Scanner(System.in);
	        int A  = scan.nextInt();
	        int B  = scan.nextInt();
	        int a=0;
	        int b = 0;
	        for(int i=0;i<Integer.MAX_VALUE-1;i++) {
	        	if(A-i < 0) {
	        		a = i-A;
	        	}else {
	        		a = A-i;
	        	}
	        	if(B-i <0) {
	        		b = i-A;
	        	}else {
	        		b = A-i;
	        	}

	        	if((a+b)%2 ==0) {
	        		System.out.println(String.valueOf((a+b)/2));
	        		return ;
	        	}
	        }
	        System.out.println("IMPOSSIBLE");
	}

}
