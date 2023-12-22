import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
    long before = N+1;
    long X = 1;
    for(long i = (long)Math.sqrt(N); i < N;i++){
      if(N%i == 0){
        X = i;
        break;
      }
    }
    System.out.println((X-1)+(N/X-1));
	}
}