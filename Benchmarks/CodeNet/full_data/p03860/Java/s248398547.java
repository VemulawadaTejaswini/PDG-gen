import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String arg = args[0];
        String splitted[] = arg.split(" ");
        Character initial = splitted[1].toUpperCase().charAt(0);
        System.out.print("A"+initial+"C");
    }
}