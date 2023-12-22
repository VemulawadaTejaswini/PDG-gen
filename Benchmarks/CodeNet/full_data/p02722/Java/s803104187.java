import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    List<Long> list = new ArrayList<>();

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        long n = sc.nextLong();

        long cnt = 0;

        Set<Long> nj = new HashSet<>();
        Set<Long> remain = new HashSet<>();

        nj.add(n);


        long root = (int)Math.sqrt(n);

        for (long i=1; i<=root; i++) {
            if (n%i==0) {
                nj.add(i);
                nj.add(n/i);
            }
        }
        for (long i=1; i<=root; i++) {
            if ((n-1)%i==0) {
                remain.add(i);
                remain.add((n-1)/i);
            }
        }

        List<Long> tmp = new ArrayList<>();

        for (long t: nj) {
            if (t==1) continue;
            while (n%t==0) {
                n /= t;
            }
            if (n%t==1) {
                cnt++;
                tmp.add(t);
            }
        }


//        System.out.println(tmp);

//        System.out.println(nj);
//        System.out.println(remain);

//        System.out.println(cnt);
        System.out.println(cnt+remain.size()-1);

    }

}
