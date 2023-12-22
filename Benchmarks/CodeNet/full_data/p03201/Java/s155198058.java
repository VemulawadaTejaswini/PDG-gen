import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Long> m = new HashMap<>();
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++){
            m.put(i, a[i]);
        }
        int ans = 0;
        for(int i = n - 1; i >= 0; i--){
            if(m.containsKey(i)){
                for(int k = 31; k >= 0; k--){
                    if(m.get(i) != null){
                        long y = m.get(i);
                    long x = (long) Math.pow(2, k);
                    if(m.containsValue(a[i] - x)){
                        int j = Arrays.binarySearch(a, a[i] - x);
                        if(j != i){
                            m.remove(j);
                            m.remove(i);
                            ans++;
                        }
                    }
                }
                }
            }
        }
        System.out.println(ans);
    }
}