import java.util.*;

class Main {
    // ABC152D
    static final long MOD = 1_000_000_007;
    // 10^9+7
    //static final int MAX = 2_147_483_646;
    static final int MAX = 10_000_000;
    // intの最大値
    static final int INF = 1_000_000_000;
    // 10^9

  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] ary = new int[a];
        for(int i = 0;i < a;i++){
            ary[i] = sc.nextInt();
        }
        Arrays.sort(ary);
        int min = ary[0];
        for(int i = 1;i < a;i++){
            if(min==ary[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    
}


