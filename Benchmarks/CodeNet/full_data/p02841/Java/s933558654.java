import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		execute();
	}

	private static void execute() {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int X = sc.nextInt();
          	int Y = sc.nextInt();

			if(a == X) {
              System.out.println(0);
            } else {
              System.out.println(1);
            }
				
		}
	}
}