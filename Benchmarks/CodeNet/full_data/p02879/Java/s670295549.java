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
        System.out.println(a < 10 && b < 10 ? a * b : -1);
    }
}
