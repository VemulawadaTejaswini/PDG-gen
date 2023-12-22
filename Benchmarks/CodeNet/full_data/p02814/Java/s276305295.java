import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt() / 2);
        }
        long lcd = 1;
        Iterator<Integer> iter = set.iterator();
        if (set.size() > 1) {
            int k = gcd(iter.next(), iter.next());
            while(iter.hasNext())
            {
                k = gcd(k, iter.next());
            }
            for(int i : set)
            {
                lcd *= i;
                lcd /= k;
            }
        } else {
            lcd = iter.next();
        }
        System.out.println((m / lcd + 1) / 2);
    }



    private static int gcd(int a, int b) {
        int k = a % b;
        if(a == 0||b == 0)
            return 0;
        while(k != 0)
        {
            k = a % b;
            a = b;
            b = k;
        }
        return a;
    }
}