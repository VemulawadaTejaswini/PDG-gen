import java.util.*;
class Main
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n/2];
        int[] b = new int[n/2];
        Map<Integer, Integer> ma = new HashMap<>();
        Map<Integer, Integer> mb = new HashMap<>();  
        for(int i = 0; i < n/2; i++){
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }
        int[] aa = new int[100002];
        int[] bb = new int[100002];
        for(int i = 0; i < n/2; i++){
            aa[a[i]]--; bb[b[i]]--;
            ma.put(aa[a[i]], a[i]);
            mb.put(bb[b[i]], b[i]);
        }
        Arrays.sort(aa);
        Arrays.sort(bb);
        int ans = aa[0] + bb[0];
        if(ma.get(aa[0]) == mb.get(bb[0])){
            if(aa[1] < bb[0]) ans = aa[1] + bb[0];
            else ans = aa[0] + bb[1];
        }
        ans += ans;
        System.out.println(ans);
    }
 }

