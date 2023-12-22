import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        String judge = "No";

       int N0 = Integer.parseInt(N.substring(0, 1));
       int N1 = Integer.parseInt(N.substring(1, 2));
       int N2 = Integer.parseInt(N.substring(2, 3));
       int N3 = Integer.parseInt(N.substring(3, 4));

       if (N1 == N2 && (N0 == N1 || N2 == N3)) {
           judge = "Yes";
       }
       System.out.println(judge);
    }

}