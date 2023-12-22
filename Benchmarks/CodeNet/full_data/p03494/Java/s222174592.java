import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int inputs[] = new int[input];
		int count = 0;
		int even = 0;
		for(int i = 0; i < input; i++) {
			inputs[i] = sc.nextInt(); 
		}
		while(true) {
			for(int j = 0; j < input; j++) {
				if(inputs[j] %2 == 0) {
					inputs[j] /= 2;
				}
				else even = 1;
			}
			if(even == 1)break;
			count++;
		}
		System.out.println(count);	
	}

}
