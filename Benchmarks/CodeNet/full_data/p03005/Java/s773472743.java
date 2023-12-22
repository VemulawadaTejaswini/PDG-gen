import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int number_n, number_k, answer = 0;
      	number_n = Integer.parseInt(sc.next());
      	number_k = Integer.parseInt(sc.next());
      	if(number_k != 1) answer = number_n - number_k;
      	System.out.println(answer);
    }
}