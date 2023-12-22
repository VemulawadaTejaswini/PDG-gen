import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int p = sc.nextInt();

        int piece = a*3 + p;
        int applepie = piece/2;

        System.out.println(applepie);
    }
}