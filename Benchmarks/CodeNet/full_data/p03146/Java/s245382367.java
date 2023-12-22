import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int prevA = s;

      	Set<Integer> prevFValues = new HashSet<>();
      	for (int i=1; i<=1000000; i++) {
            int newA = f(prevA);
            if (prevFValues.contains(newA)) {
    		    System.out.println(i);
            }
            prevA = newA;
        }
    }

    static int f(int n) {
    	return (n % 2 == 0) ? (n / 2) : (3 * n + 1);
    }
}
