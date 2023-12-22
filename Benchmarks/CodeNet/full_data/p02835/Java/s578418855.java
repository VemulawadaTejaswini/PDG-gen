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
        int c = inp.nextInt();
        int d = a + b + c;
        if (d < 22) System.out.println("win");
        else System.out.println("bust");
    }
}
