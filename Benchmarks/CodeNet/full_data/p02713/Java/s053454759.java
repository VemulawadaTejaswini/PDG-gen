import java.util.*;

class Main{
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        System.out.println(gcd(1,1,1,0));
    }

    static long gcd(int a,int b,int c,long ans){
        if(a==n&&b==n&&c==n)
            return ans+n;
            
        long add = 1;
        int min = Math.min(a,Math.min(b,c));
        int tmp1 = a;
        int tmp2 = b;
        int tmp3 = c;

        for(int i = 1;i <= min;i++){
            if(tmp1%i==0&&tmp2%i==0&&tmp3%i==0){
                add *= i;
                tmp1 /= i;
                tmp2 /= i;
                tmp3 /= i;
            }
        }
        add *= 3;

        if(b==n&&c==n)
            return gcd(a+1,a+1,a+1,ans+add);

        if(a==b&&b==c){
            return gcd(a,b,c+1,ans+a);
        }else if(c<n){
            return gcd(a,b,c+1,ans+add);
        }else if(c==n){
            return gcd(a,b+1,b+1,ans+add);
        }

        return 44444;
    }
}