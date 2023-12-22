import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
        long sum = 0;
        for(long i=1; i<num; i++){
          if(num / i == num % i) sum += i;
        }
		System.out.println(sum);
	}
}