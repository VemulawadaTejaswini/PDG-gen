import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("aの値(a<b)を入力");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("b(a<b)の値を入力");
		int b = scan.nextInt();
		System.out.println("xの値を入力");
		int x = scan.nextInt();
		
		int count = 1;
		for(int i = a; i < b; i++){
			if(i % x == 0){
				count++;
			}	
		}
		System.out.println(count);
	}
}
