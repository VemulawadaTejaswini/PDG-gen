import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        int p = n / 15;
        System.out.println(n * 800 - p * 200);
    }
}