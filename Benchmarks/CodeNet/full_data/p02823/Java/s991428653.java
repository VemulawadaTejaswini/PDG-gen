import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();
        if((a+b)%2==0){
            System.out.println((a+b)/2-a);
        } else {
            if(a-1>n-b){
                long ans = n-b,tmpA = a+n-b,tmpB = n;
                while((tmpA!=n)&&(tmpA+tmpB)/2!=0){
                    tmpA ++;
                    ans ++;
                }
                if(((tmpA+tmpB)/2==0)){
                    ans += (tmpA+tmpB)/2;
                }
                System.out.println(ans);
            } else {
                long ans = a-1,tmpA = 1,tmpB = b-(a-1);
                while((tmpB!=1)&&(tmpA+tmpB)/2!=0){
                    tmpB --;
                    ans ++;
                }
                if(((tmpA+tmpB)/2==0)){
                    ans += (tmpA+tmpB)/2;
                }
                System.out.println(ans);
            }
        }
    }
}