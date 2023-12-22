import java.util.*;

class Main{
    //149e
    static final int DIV = 100000007;
    static final int MAX = 2000000000;
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ary = new int[n];
        for(int i = 0;i < n;i++){
            ary[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(ary);
        long ans = 0;
        int count = 0;
        for(int i = n-1;i >= 0;i--){
            for(int j = i;j >= 0;j--){
                if(count == m)break;
                count++;
                ans += ary[i] + ary[j];
                if(i != j){
                    if(count == m)break;
                    count++;
                    ans += ary[i] + ary[j];
                }
            }
            if(count == m)break;
        }
        System.out.println(ans);
    }
    
}