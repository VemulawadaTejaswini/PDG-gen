import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        int k = inp.nextInt();
        int x = inp.nextInt();
        if (500 * k >= x) System.out.println("Yes");
        else System.out.println("No");
    }
}
