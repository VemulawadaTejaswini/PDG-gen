import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int N = scanner.nextInt();
		final int A = scanner.nextInt();
		final int B = scanner.nextInt();
		String s = scanner.next();
		int a = 0, b = 0;
		for(int i = 0; i < N; ++i){
			if(s.charAt(i) == 'a'){
				if(a+b < A+B){
					++a;
					System.out.println("Yes");
					continue;
				}
			}
			else if(s.charAt(i) == 'b'){
				if(a+b < A+B && (b<B || b == 0)){
					++b;
					System.out.println("Yes");
					continue;
				}
			}
			System.out.println("No");
		}
		scanner.close();
	}

}
