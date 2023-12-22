import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int X = scan.nextInt();

		int count = 0;
		for(int a = 0; a<= A; a++){
			for(int b = 0; b<=B; b++){
				for(int c = 0; c<=C; c++){
					if(500*a+100*b+50*c==X){
						count++;
					}
				}
			}

		}
		int 	answer = count;
		System.out.println(answer);

	}

}
