import java.util.Scanner;

public class Atprb1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String S= scan.next().toLowerCase();
        String T= scan.next().toLowerCase();

        System.out.println(""+T.concat(S));
    }
}