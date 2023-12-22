import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int max = 0;
		if(a >= b && a >= c){
			max = a;
			a = 0;
		}else if(b >= c){
			max = b;
			b = 0;
		}else{
			max = c;
			c = 0;
		}
		for(int i=0; i<k; i++){
			max *= 2;
		}
		System.out.println(a + b + c + max);
	}
}
