import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 4;
		int num = scanner.nextInt();
		int[] k = new int[N];
		for(int i=0;i<N;i++){
			int division = (int) (1000 / (Math.pow(10, i)));
			k[i] = num / division;
			num = num % division;
		}
		if((k[0] == k[1] && k[1] ==k[2]) || (k[1] == k[2] && k[2] == k[3])){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
