import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt(),y = scanner.nextInt(),z = scanner.nextInt();
		int count = 0;
		int sum = 0;
		for(int i=1;i<x;i++){
			sum = z * (i+1) + y * i;
			if(sum <= x){
				count = i;
			}
		}
		System.out.println(count);
	}

}
