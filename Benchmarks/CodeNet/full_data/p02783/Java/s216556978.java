import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int H = input.nextInt();
		int A = input.nextInt();
		int K=H/A;
		
		if(H%A==0) {
			System.out.println(K);
		}
		else {
			System.out.println(K+1);
		}
	}

}
