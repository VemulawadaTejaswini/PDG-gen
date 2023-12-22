import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		if (n == 1) {
		    System.out.println("Hello World");
		} else {
		    int x = Integer.parseInt(sc.next());
		    int y = Integer.parseInt(sc.next());
		    System.out.println(x + y);
		}
    }
}