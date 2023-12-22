import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        List<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        long n = (long)scan.nextInt();
        for(int i = 0 ; i < 5; i++) {
            list.add(scan.nextInt());
        }
        long p = 0;
        int min = Collections.min(list);
        if (min > 0) {
            p = n / min;
        }
        System.out.println(n + p);
    }
}
