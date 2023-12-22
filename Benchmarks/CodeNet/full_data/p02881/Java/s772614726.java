import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = Long.parseLong(sc.next());
        sc.close();

        List<Long> list = new ArrayList<>();

        Long n = N;
        Long c =1L;
        while (true) {
            if (n % 2==0) {
                list.add(2L);
                n /= 2;
                c *= 2L;
            } else 
                break;
        }
        for (Long i=3L; c<N; ) {
            if (n % i==0) {
                list.add(i);
                n /= i;
                c *= i;
            } else {
                i += 2;
            }
        }
        Long a = 1L;
        Long b = 1L;
        for (int i=0; i<list.size(); i++) {
            if (i % 2==0)
                a *= list.get(i);
            else
                b *= list.get(i);
        }

        System.out.println(a+b-2);
    }
}