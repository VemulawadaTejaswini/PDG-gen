import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int X = scan.nextInt();

		int count = 0;
		for(int i=0; i<=A; i++){
			for(int j=0; j<=B; j++){
				for(int k=0; k<=C; k++){
					if(X == (500*i + 100*j + 50*k)){
						count += 1;
					}
				}
			}
		}
		System.out.println(count);
	}
}