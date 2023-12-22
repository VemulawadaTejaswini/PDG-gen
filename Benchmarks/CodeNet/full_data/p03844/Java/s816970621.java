import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        String op = inp.next();
        int y = inp.nextInt();
        if (op.equals("+")) System.out.println(x + y);
        else System.out.println(x - y);
    }
}