import java.util.*;
class Main{
    private static int gcd(int a,int b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        return gcd(b,a%b);
    }
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int ans=0;
        for(int a=1;a<=N;a++){
            for(int b=1;b<=N;b++){
                for(int c=1;c<=N;c++){
                    ans=ans+gcd(a,gcd(b,c));
                }
            }
        }
        System.out.println(ans);
    }
}