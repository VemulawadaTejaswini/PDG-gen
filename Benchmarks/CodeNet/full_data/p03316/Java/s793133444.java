import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		int sum = 0;
		int N2 = N;
		int valLen = String.valueOf( N ).length();

		for(int i = 0; i<valLen; i++){
			sum += (N2%10);

			N2 /=10;
		}

		if(N%sum == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}