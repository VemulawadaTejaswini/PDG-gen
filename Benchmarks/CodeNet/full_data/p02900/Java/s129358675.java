import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        long max = Math.max(A,B);
        long min = Math.min(A,B);
        ArrayList<Long> list = new ArrayList<>();
        list.add(1L);
        long sosu = 0;
        for(long i=2; i<=Math.sqrt(min); i++) {
            if(max % i == 0) {
                if(min % i == 0) {
                    if(sosuu(i) && (list.contains(i) == false)) {sosu++;}
                    list.add(i);
                }
                if(min % (max/i) == 0) {
                    if(sosuu(max/i) && (list.contains(max/i) == false)) {sosu++;}
                    list.add(max/i);
                }
            }
        }
        
        if(sosuu(A) && sosuu(B) && A == B) sosu++;
        System.out.println(sosu+1);
    }

    public static boolean sosuu(long n) {
        for(long i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
