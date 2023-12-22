import java.util.*;


class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        final long A = sc.nextLong();
        final long B = sc.nextLong();
        final long C = sc.nextLong();
        final long D = sc.nextLong();
        long count=B-A+1;

        long check_C=A/C;
        long check_D=A/D;
        while(check_C*C<=B || check_D*D<=B){
            while(check_C*C<=check_D*D){
                if(check_C*C>=A && check_C*C<=B){
                    //System.out.println(check_C*C + " " + check_D*D);
                    if(check_D*D == check_C*C)count++;
                    count--;
                }
                check_C++;
            }
            while(check_D*D<=check_C*C){
                if(check_D*D>=A && check_D*D<=B){
                    //System.out.println(check_C*C + " " + check_D*D);
                    if(check_D*D == check_C*C)count--;
                    count--;
                }
                check_D++;
            }
        }
        System.out.println(count);
    }
}