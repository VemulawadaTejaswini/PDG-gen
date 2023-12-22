import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		for(int i=1; ; i++){
			long a = A*i;
			if(a%B == 0){
				System.out.println(a);
				return;
			}
			a /= i;
		}
	}
}