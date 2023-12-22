import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("aの値(a<b)を入力");
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		System.out.println("b(a<b)の値を入力");
		long b = scan.nextLong();
		System.out.println("xの値を入力");
		long x = scan.nextLong();
		
		long count = 1;
		for(long i = a; i < b; i++){
			if(i % x == 0){
				count++;
			}	
		}
		System.out.println(count);
	}
}
