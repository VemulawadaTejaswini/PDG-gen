import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = in.nextInt();
		
		int sum = 0;
		for(int i = 0; i < n; i++){
			if(in.nextInt() % 2 == 1){
				sum++;
			}
		}
		if(sum % 2 == 1){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}

	}
}