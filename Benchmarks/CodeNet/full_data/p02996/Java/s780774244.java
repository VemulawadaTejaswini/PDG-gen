import java.util.*;
import java.math.*;

public class Main {

    static long MOD = 1000000007;

    public static long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a,b);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Node> l = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            l.add(new Node(sc.nextInt(), sc.nextInt()));
        }
        l.sort(Comparator.comparingInt(Node::b));
        int now = 0;
        boolean ok = true;
        for(int i = 0; i < n; i++) {
            Node no = l.get(i);
            if(no.a + now > no.b) {
                ok = false;
                break;
            }
            now = no.a + now;
        }
        System.out.println(ok?"Yes":"No");

    }
    static class Node {
        int a;
        int b;
        Node(int c, int d) {
            a = c;
            b = d;
        }
        public int b() {
            return this.b;
        }
    }
}