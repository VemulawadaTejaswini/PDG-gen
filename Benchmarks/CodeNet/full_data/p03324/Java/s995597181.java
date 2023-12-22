import java.util.*;

class Main {
    public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	int d = scan.nextInt();
	int n = scan.nextInt();
	int anser = (int)Math.pow(100, d) * n;
	System.out.println(anser);
    }
}
