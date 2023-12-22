import java.util.*;
public class Main{
	//B - Chocolate
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
	    int D = scanner.nextInt();
	    int X = scanner.nextInt();
	    
	    for(int i =1; i<=N; i++){
	      int ai = scanner.nextInt();
	      for(int d = 1; d<=D; d+=ai){
	         X++;
	      }
	    }
	    System.out.println(X);

	}

}
