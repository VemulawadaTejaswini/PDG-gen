import java.util.*;

class Main{
    //
    static final int DIV = 100000007;
    static final int MAX = 2000000000;
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        for(int i = 0;i < n;i++)ary[i] = sc.nextInt();
        Arrays.sort(ary);
        if(n%2==0){
            if(ary[0]!=1||ary[1]!=1){
                System.out.println(0);
                return;
            }
            for(int i = 0;i < n-1;i++){
                if(i%2==0&&ary[i]!=ary[i+1]){
                    System.out.println(0);
                    return;
                }
                if(i%2==1&&ary[i]!=ary[i+1]-2){
                    System.out.println(0);
                    return;
                }
            }
        }else{
            if(ary[0]!=0){
                System.out.println(0);
                return;
            }
            for(int i = 1;i < n-1;i++){
                if(i%2==0&&ary[i]!=ary[i+1]){
                    System.out.println(0);
                    return;
                }
                if(i%2==1&&ary[i]!=ary[i+1]+2){
                    System.out.println(0);
                    return;
                }
            }
        }
        long ans;
        ans=modpow((n+1)/2);
        System.out.println(ans);
    }

    static long modpow(int n){
        long ans =1;
        long a = 2;
        while(n>0){
            if((n&1)==1)ans = ans*a % DIV;
            a = a * a % DIV;
            n >>= 1;
        }
        return ans;
    }
    
}