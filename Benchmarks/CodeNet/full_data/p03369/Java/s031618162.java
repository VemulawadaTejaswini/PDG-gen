import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        s = s.replaceAll("x", "");
        System.out.println(700 + s.length() * 100);
        inp.close();
    }
}
