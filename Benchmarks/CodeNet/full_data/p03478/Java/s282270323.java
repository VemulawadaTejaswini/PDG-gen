import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();

		int total = 0;
		for(int i = 1; i <=N; i++){
			while(i > 0){
				int temp = Calculation(i);
				if(temp >= A && temp <= B){
					total += i;
				}
			}
		}
		System.out.println(total);
	}

	public static int Calculation(int num){
		int ret = 0;
		while(num > 0){
			ret += num % 10;
			num += num / 10;
		}
		return ret;
	}
}