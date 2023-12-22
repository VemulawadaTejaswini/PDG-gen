import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
        String input = scan.next();
	String output = "2018" + input.substring(4, input.length());

        System.out.print(output);
    }
}