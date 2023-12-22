import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[10001];
        int n = sc.nextInt();
        sc.nextInt();
        for(int i = 0; i < n; i++){
            cnt[sc.nextInt() - 1]++;
            cnt[sc.nextInt()]--;
            sc.nextInt();
        }
        sc.close();
        int max = 0;
        int cur = 0;
        for(int i = 0; i < 10001; i++){
            cur += cnt[i];
            max = Math.max(max, cur);
        }
        System.out.println(max);
    }
}
