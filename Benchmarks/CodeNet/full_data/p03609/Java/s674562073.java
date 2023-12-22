import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int t = inp.nextInt();
        System.out.println(Math.max(x - t, 0));
    }
}