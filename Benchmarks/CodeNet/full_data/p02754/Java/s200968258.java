import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
	    int N = sc.nextInt();
    	int A = sc.nextInt();
      	int B = sc.nextInt();
      　int result = N / (A+B) * A;
        int m = N % (A+B);
        if(m>=A){
          result += A;
        }else{
          result += m;
        }
        System.out.println(result);
    }
}