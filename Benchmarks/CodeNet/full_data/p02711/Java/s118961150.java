import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        if(n % 10 == 7 || (n / 10) % 10 == 7  || (n / 100) == 7)
            out.println("Yes");
        else out.println("No");
        out.close();
    }
}
