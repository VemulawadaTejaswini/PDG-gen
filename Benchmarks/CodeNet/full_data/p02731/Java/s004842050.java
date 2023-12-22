import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		
		Double L = cin.nextDouble();
		
		Double w = L/3;
		
		Double ans = w*(w-L)*(w-L)/4;
		
		System.out.println(ans);
		
	}

}
