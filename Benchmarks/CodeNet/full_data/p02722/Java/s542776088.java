import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n-1;
        Set<Long> set = new HashSet<>();
        set.add(n);
        for (int i = 2; i < Math.sqrt(n)+1; i++) {
            if(n%i == 0){
                long b = n/i;
                while(b%i==0)b/=i;
                if(b%i == 1){
                    set.add((long)i);
                }
            }
        }
        for (int i = 1; i < Math.sqrt(a); i++) {
            if(a%i == 0){
                long b = a/i;
                set.add((long)i);
                set.add(b);
            }
        }
        set.remove(Long.valueOf(1));
        System.out.println(set.size());
        sc.close();

    }

}
