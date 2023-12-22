import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        String s = inp.next();
        for (int i = 0; i < 10; i++) {
            if (s.contains(stringTimes(String.valueOf(i), 2))) {
                System.out.println("Bad");
                return;
            }
        }
        System.out.println("Good");
    }
    public static String stringTimes(String s, int t) {
        String res = "";
        for (int i = 0; i < t; i++) res += s;
        return res;
    }
}
