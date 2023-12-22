import java.util.*;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        sc.close();

        int sum = 0;
        for (int i = 0; i < N.length(); ++i) {
            String w = N.substring(i, i + 1);
            sum += Integer.parseInt(w);
        }

        int NN = Integer.parseInt(N);
        if (NN % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}
