import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        int Z = Integer.parseInt(sc.next());
        sc.close();

        System.out.println(Z+ " " + X + " " + Y);

    }

}

       