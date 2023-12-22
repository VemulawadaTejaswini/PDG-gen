import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=0;
        for (int i=1;i<n+1;i++){
            if (search(i)==8&&i%2==1){
                count++;
            }
        }
        System.out.println(count);
    }
    public static long search(long num){
        ArrayList<Long> ff = new ArrayList<Long>();
        for (long i = 2; i <= num; i++) {
            if (num % i == 0) {
                num /= i;
                ff.add(i);
                i = 1;
            }
        }
        ArrayList<Long> dd = new ArrayList<Long>();
        dd = (ArrayList<Long>) ff.clone();
        ArrayList<Long> ee = new ArrayList<Long>(new LinkedHashSet<>(dd));
        long[] d = new long[ee.size()];
        for (long g:d){
            g = 0;
        }
        for (int i = 0;i < ee.size();i++){
            for (long k:dd){
                if (ee.get(i) == k){
                    d[i]++;
                }
            }
        }
        long ans = 1;
        for (int i = 0;i < d.length;i++){
            ans = ans * (d[i]+1);
        }
        return ans;
    }
}