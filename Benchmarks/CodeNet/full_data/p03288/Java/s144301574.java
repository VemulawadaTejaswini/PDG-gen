import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int r = inp.nextInt();
        System.out.println(
                r < 1200 ? "ABC" :
                r < 2800 ? "ARC" :
                "AGC"
            );
        inp.close();
    }
}
