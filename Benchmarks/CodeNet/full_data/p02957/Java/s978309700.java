import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        if((a%2==0 && b%2==0) || (a%2!=0 && b%2!=0)) {
            out.println((a+b)/2);
        }else {
            out.println("IMPOSSIBLE");
        }


        out.flush();

    }

}
