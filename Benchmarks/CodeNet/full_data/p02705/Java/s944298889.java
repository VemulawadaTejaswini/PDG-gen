import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        int r = inp.nextInt();
        System.out.println((double)r * 3.141592653589257 * 2.0);
    }
}
