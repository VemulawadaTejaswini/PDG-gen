import java.util.*;

public class Main {
    static long ans;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] num = new int [N];
        long sum = 0;
        ans=0;
        for(int i=0; i<N; i++){
            num[i] = sc.nextInt();
            sum+=num[i];
            if(i!=0)sum=function(i,num,sum);
        }

        long tmp = ans;
        ans = Math.abs(num[0])+1;
        if(num[0]>0){
            sum = -1;
        }else{
            sum = 1;
        }
        for(int i=1; i<N; i++){
            sum+=num[i];
            sum=function(i,num,sum);
        }
        ans = Math.min(tmp,ans);
        System.out.println(ans);
    }
    static long function(int i, int[]num, long sum){
        int a = sign((sum-num[i]));
        int b = sign(sum);
        int t = a*b;
        if(t==0){
            ans++;
            if(a>0){
                return -1;
            }else{
                return 1;
            }
        }else if(t<0){
            return sum;
        }else{
            ans+=(Math.abs(sum)+1);
            if(sum>0){
                return -1;
            }else{
                return 1;
            }
        }
    }
    static int sign(long A){
        if(A>0){
            return 1;
        }else if(A<0){
            return -1;
        }else{
            return 0;
        }
    }
}
