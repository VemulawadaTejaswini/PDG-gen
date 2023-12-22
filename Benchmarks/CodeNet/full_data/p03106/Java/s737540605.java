import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		int max = a;
		if( a < b ) {
			max = b;
		}
		int flag = 0;
		for(int i = 1; i < max+1; i++) {
			if( a%i == 0 && b%i == 0 ) {
				flag++;
			}else if( a%2 == 0 && b%2 == 0 && i%2 == 0) {
				flag++;
			}else if( a%5 == 0 && b%5 == 0 && i%5 == 0) {
				flag++;
			}
			if(flag == k) {
				System.out.println(i);
				break;
			}
		}
	}
}