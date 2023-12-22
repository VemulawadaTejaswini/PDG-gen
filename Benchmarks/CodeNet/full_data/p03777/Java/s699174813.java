import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String a = inp.next();
        String b = inp.next();
        inp.close();
        if (a.equals("H")) {
            System.out.println(b);
        }
        else {
            System.out.println(b.equals("D") ? "H" : "D");
        }
    }
}