import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		if (N==1 && M==1) {
			System.out.println(0);
		} else {
			System.out.println((N*(N-1)/2)+(M*(M-1)/2));
		}
		
			
		
		
      	sc.close();
    }
		
		
}
