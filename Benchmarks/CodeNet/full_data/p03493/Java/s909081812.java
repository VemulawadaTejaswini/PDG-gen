import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
      	int c = sc.nextInt();
          
        int result = IntStream.of(a, b, c).sum();
      
      	System.out.println(result);
	}
}