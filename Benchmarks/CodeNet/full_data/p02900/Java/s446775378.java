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
        int sosu = 0;
        for(long i=2; i<=Math.sqrt(min); i++) {
            if(min % i == 0) {
                if(max % i == 0) {
                    if(sosuu(i) && list.contains(i) == false) {sosu++;}
                    list.add(i);
                }
                if(max % (min/i) == 0) {
                    if(sosuu(min/i) && list.contains(min/i) == false) {sosu++;}
                    list.add(min/i);
                }
            }
        }
        
        Collections.sort(list);
        ArrayList<Long> cloneList = (ArrayList<Long>)list.clone();
        
        long ans = 0;
        long count = 0;
        ArrayList<Long> yakusu = new ArrayList<>();
        for(int i=0; i<list.size(); i++) {
            
        }
        System.out.println(sosu+1);
    }
    //最大公約数
    public static long saiyaku(long a, long b) {
        if(a < b) return saiyaku(b, a);
        if(b == 0) return a;
        long w = b;
        a = a % b;
        b = w;
        return saiyaku(a, b);
    }
    
    public static boolean sosuu(long n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
