// Java
// do not specify any packages!!!
import java.io.*;
import java.util.*;
public class Main { // "Main" should be used for most online judges
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTestCases = sc.nextInt();

        Integer n1 = new Integer(sc.next());
        Integer n2 = new Integer(sc.next());

        for (int i = 0; i < numTestCases - 1; i++) {
            Integer t = new Integer(sc.next());
            Integer a = new Integer(sc.next());
            int g = t;
            int s = a;

            while (t < n1 || a < n2) {
                t += g;
                a += s;
            }

            n1 = t;
            n2 = a;
        }

        System.out.println(n1 + n2);
    }
}