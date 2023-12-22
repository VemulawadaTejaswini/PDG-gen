import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int v = Integer.parseInt(a+b);
        int x = (int)Math.sqrt(v);
        if (x * x == v) System.out.println("Yes");
        else System.out.println("No");

        return;
    }

}