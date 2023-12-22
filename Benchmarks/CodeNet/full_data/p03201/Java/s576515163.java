import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> a = new ArrayList<Long>();
        HashMap<Long, Integer> num = new HashMap<Long, Integer>();
        for(int i=0; i<n; i++){
            long tmp = sc.nextLong();
            a.add(tmp);
            int mnum;
            if(num.containsKey(tmp)){
                num.replace(tmp, num.get(tmp) + 1);
            }else{
                num.put(tmp, 1);
            }
        }
        sc.close();

        int npow = 40;
        long[] pow2 = new long[40];
        for(int i=0; i<pow2.length; i++){
            pow2[i] = (long)Math.pow(2, i);
        }

        Collections.sort(a);

        int ans = 0;
        for(int i=a.size()-1; i>=0; i--){
            long cur = a.get(i);
            if(i > 0){
                long cur2 = a.get(i-1);
                if(cur == cur2){
                    for(int j=0; j<npow; j++){
                        if(cur*2 == pow2[j]){
                            ans++;
                            break;
                        }
                    }
                    i--;
                    continue;
                }
            }
            for(int j=0; j<npow; j++){
                if(cur >= pow2[j]) continue;
                int pos = Collections.binarySearch(a, pow2[j]-cur, (ma, mb) -> Long.compare(ma, mb));
                if(pos >= 0 && pos < i){
                    a.remove(i);
                    a.remove(pos);
                    i--;
                    ans++;
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}