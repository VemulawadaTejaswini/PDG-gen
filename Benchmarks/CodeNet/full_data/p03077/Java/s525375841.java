import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        List<Long> list = new ArrayList<Long>();
        Scanner scan = new Scanner(System.in);
        long n = (long)scan.nextLong();

        for(int i = 0 ; i < 5; i++) {
            list.add(scan.nextLong());
        }
        long p = 0;
        long min = Collections.min(list);
        if (n / min >= 1 && min % 2 == 1) {
            min += 1;
        }
        if (min > 1) {
            p = n / min;
        } else {
            p = n;
        }
        System.out.println(5 + p);
    }
}
