import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 改行
        String[] strz = new String[N];
        for (int n = 0; n < N; n++){
            strz[n] = sc.nextLine();
        }

        for (int n = 0; n < N; n++){
            char[] charn = strz[n].toCharArray();
            Arrays.sort(charn);
            strz[n] = new String(charn);
        }

        Map<String, Integer> map = new HashMap<>();
        for (String s : strz) {
            Integer i = map.get(s);
            map.put(s, i == null ? 1 : i + 1);
        }
        long cnt = 0;
        for (String key : map.keySet()){
            long num = map.get(key);
            if (num > 1) {
                // cnt+=conbi(num,2);
                cnt+= (num*(num-1)/2);
            }
        }
        System.out.println(cnt);
    }

    public static long f (long n){
        if (n<=1){return 1;}
        return f(n-1)*n;
    }
    public static long conbi(long n,long r){
        return (f(n)/(f(n-r)*f(r)));
    }
}
