import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(n <=  k) {
          System.out.println(0);
          return ;
        }
        List<Integer> h = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            h.add(sc.nextInt());
        }
        h.sort(Collections.reverseOrder());
        long sum = 0;
        for(int i = k; i < n; i ++) {
            sum += h.get(i);
        }
        System.out.println(sum);
    }
}