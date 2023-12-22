import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        ArrayList<Store> sl = new ArrayList<>();
        for(int i = 0; i < n; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            Store s = new Store(a,b);
            sl.add(s);
        }
        Collections.sort(sl);
        long ans = 0;
        for(Store s : sl){
            if(m <= s.b){
                ans += m * s.a;
                break;
            }else{
                ans += s.b * s.a;
                m -= s.b;
            }
        }
        System.out.println(ans);
    }
}

class Store implements Comparable<Store>{
    long a;
    long b;
    public Store(long a, long b){
        this.a = a;
        this.b = b;
    }
    public int compareTo(Store s2){
        if(this.a > s2.a){
            return 1;
        }else if(this.a < s2.a){
            return -1;
        }else{
            return 0;
        }
    }
}
