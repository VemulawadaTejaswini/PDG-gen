import java.util.*;

class Main {

    static public double solve(int L) {
        return Math.pow(L/3.0, 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();

        sc.close();

        System.out.println(String.format("%.7f", solve(L)));
    }
}