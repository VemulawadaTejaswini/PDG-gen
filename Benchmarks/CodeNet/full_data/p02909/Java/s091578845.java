import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println( "Sunny".equals(s) ? "Cloudy" : "Cloudy".equals(s) ? "Rainy" : "Sunny" );

    }

}
