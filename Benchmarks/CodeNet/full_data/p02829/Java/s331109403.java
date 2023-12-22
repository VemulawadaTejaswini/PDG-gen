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
        int ans = 0;
        for (int i = 1; i <= 3; i++) {
            if (i != a && i != b) ans = i;
        }
        System.out.println(ans);
    }
}
