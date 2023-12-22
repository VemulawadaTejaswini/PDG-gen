import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        String S2 = S.replaceAll("[a-z]+", "x");

        System.out.println("S2");
	}
}