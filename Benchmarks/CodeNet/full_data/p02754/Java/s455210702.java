import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] arg){
        Main m = new Main();
        m.run();
    }

    void run(){
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long div = n/(a+b);
        long mod = n%(a+b);

        System.out.println( (div * a) + Math.min(mod,a));
    }
}
