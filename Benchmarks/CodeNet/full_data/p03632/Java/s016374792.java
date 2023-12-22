import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int aliceStart = Integer.parseInt(sc.next());
        int aliceEnd = Integer.parseInt(sc.next());
        int bobStart = Integer.parseInt(sc.next());
        int bobEnd = Integer.parseInt(sc.next());
        if (bobStart >= aliceStart && bobStart <= aliceEnd) {
            if (bobEnd <= aliceEnd) {
                System.out.println(bobEnd - bobStart);
            } else {
                System.out.println(aliceEnd - bobStart);
            }
        } else {
            System.out.println(0);
        }
    }
}