import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int d = inp.nextInt();
        int aa = a + b;
        int cc = c + d;
        if (aa == cc) System.out.println("Balanced");
        if (aa > cc) System.out.println("Left");
        if (aa < cc) System.out.println("Right");
    }
}