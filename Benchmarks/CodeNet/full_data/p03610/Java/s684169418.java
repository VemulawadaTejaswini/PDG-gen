import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        String X = sc.next();
        
        for (int i = 0; i < X.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(X.substring(i, i+1));
            }
        }

		sc.close();
	}
}
