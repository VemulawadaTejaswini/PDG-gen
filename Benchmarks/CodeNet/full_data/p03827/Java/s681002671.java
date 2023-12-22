import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc2.next();

		int x = 0;
		int max = 0;

		for(int i = 0; i < N; i++){
			char c = S.charAt(i);
			if(c == 'I'){
				x++;
			}else if(c == 'D'){
				x--;
			}

			if(x > max){
				max = x;
			}
		}

		System.out.println(max);
	}
}
