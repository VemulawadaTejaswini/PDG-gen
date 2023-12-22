import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        s = s.replaceAll("0", "");
        System.out.println(s.length());
    }
}
