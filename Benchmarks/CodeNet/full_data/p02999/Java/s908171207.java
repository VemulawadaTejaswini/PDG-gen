import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String[] params = in.nextLine().split(" ");
        int x = Integer.parseInt(params[0]);
        int a = Integer.parseInt(params[1]);

        System.out.println( x < a ? 0 : 10);

    }
}