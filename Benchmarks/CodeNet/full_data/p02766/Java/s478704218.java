import java.util.Scanner;
import java.lang.Integer;

class Main {
    public static void main(String[] args) throws NumberFormatException {
      	Scanner sc = new Scanner(System.in);
		var N = sc.nextInt();
        var K = sc.nextInt();
        System.out.println(String.valueOf(Integer.parseInt(N, K)).length());
    }
}
