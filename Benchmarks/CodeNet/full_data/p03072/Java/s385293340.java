import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int X = 0;
			int C = 0;
		int A = sc.nextInt();
		for(int i = 0; i < A; i++){
			int B = sc.nextInt();
			if(i == 0){
				C = B;
			}
			if(C <= B){
				X += 1;
				C = B;
			}
		}
		System.out.println(X);
	}
}	
		