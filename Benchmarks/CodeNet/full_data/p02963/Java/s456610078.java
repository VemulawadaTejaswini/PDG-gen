import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Long s = Long.parseLong( in.nextLine() );
        System.out.println( "0 0 " + s * 2 + " 0 0 1");

    }

}