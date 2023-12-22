import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        int a = inp.nextInt();
        int b = inp.nextInt();
        int ans = a * (a - 1) / 2 + b * (b - 1) / 2;
        System.out.println(ans);
    }
}
