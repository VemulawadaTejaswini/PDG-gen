import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int e = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());


        if ((e - a) <= k) {
            if ((d - a) <= k) {
                if ((c - a) <= k) {
                    if ((b - a) <= k) {
                        System.out.println("Yay!\n");
                    }
                }
            }
        }
        else
            System.out.println(":(\n");
    }
}
