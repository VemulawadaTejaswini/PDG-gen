import java.util.*;

public class Main{

    static int n, m;
    static int[] a;
    static long[] memo;
    //static long count = 0;

    static void sortDesc(int[] nums) {

    Arrays.sort(nums);

    int[] numsTemp = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
        numsTemp[i] = nums[nums.length - 1 - i];
    }

    for (int i = 0; i < nums.length; i++) {
        nums[i] = numsTemp[i];
    }

}

    /*static void step(int x){
        if(x > n) return;
        else if(x == n){
            count++;
            return;
        }
        for(int i = 0; i < m; i++){
            if(x == a[i]) return;
            if(x < a[i]) break;
        }
        step(x + 1);
        step(x + 2);
    }*/

    static long step2(int x){
        if(memo[x] > -1) return memo[x];
        int b = 0;
        for(int i = 0; i < m; i++){
            if(a[i] < x - 2) break;
            else if(x - 1 == a[i]) b += 1;
            else if(x - 2 == a[i]) b += 2;
        }
        if(x >= 2){
            if(b == 3){
                return 0;
            }else if(b == 1){
                memo[x] = step2(x - 2) % 100000007;
                return memo[x];
            }else if(b == 2){
                memo[x] = step2(x - 1) % 100000007;
                return memo[x];
            }
            else{
                memo[x] = (step2(x - 1) + step2(x - 2)) % 100000007;
                return memo[x];
            }
        }else return 1;
    }

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		n = sc.nextInt();
        // スペース区切りの整数の入力
        m = sc.nextInt();
        a = new int[m];
        memo = new long[n + 1];

        for(int i = 0; i < m; i++){
            a[i] = sc.nextInt();
        }

        Arrays.fill(memo, -1);

        //Arrays.sort(a, Comparator.reverseOrder());
        sortDesc(a);

        if(n >= 1000) step2(1000);
        if(n >= 2000) step2(2000);
        if(n >= 3000) step2(3000);
        if(n >= 4000) step2(4000);
        if(n >= 5000) step2(5000);
        if(n >= 6000) step2(6000);
        if(n >= 7000) step2(7000);
        if(n >= 8000) step2(8000);
        if(n >= 9000) step2(9000);

        /*for(int i = 1; i < 20; i++){
            if(n >= 500 * i) step2(500 * i);
        }*/

        //step(0);
        // 出力
        System.out.println(step2(n));

    }

}