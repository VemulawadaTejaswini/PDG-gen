import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int min = 0;
		int min2 = 0;

		if(a < b){
			min = a;
			if(b < c){
				min2 = b;
			}
			else{
				min2 = c;
			}
		}
		else{
			min = b;
			if(a < c){
				min2 = a;
			}
			else{
				min2 = c;
			}
		}
		System.out.println(min + min2);
	}
}