import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		long sum = 0;
		for(int i=1; i<=N; i++){
			boolean bFizz = false;
			if(i%3==0){
				bFizz = true;
				continue;
			}
			boolean bBuzz = false;
			if(i%5==0){
				bBuzz = true;
				continue;
			}
			sum += i;
		}
		
		System.out.printf("%d\n", sum);
	}
}