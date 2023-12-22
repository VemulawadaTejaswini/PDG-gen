import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int result = 0;
		for(int i=0;i<x;i++){
			result += 800;
			if(i % 15 == 0){
				result -= 200;
			}
		}
		System.out.println(result);
	}

}
