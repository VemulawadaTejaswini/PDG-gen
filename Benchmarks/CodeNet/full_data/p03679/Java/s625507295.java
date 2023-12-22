import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = a - b;
        if (c <= 0) {
            if (Math.abs(c) <= x) {
                System.out.println("safe");
            }
            else {
                System.out.println("dangerous");
            }
        }
        else {
            System.out.println("delicious");
        }
    }
}
