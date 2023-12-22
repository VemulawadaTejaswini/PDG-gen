import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        Long maxdivisor = euclidean(a, b);
        int res = numberOfDivisor(maxdivisor);
        System.out.println(res);
    }


    public static Long euclidean(Long a, Long b) {
        Long l1 = a;
        Long l2 = b;

        while(l1%l2!=0){
            Long tmp = l1%l2;
            l1 = l2;
            l2 = tmp;
        }
        return l2;
    }

    public static int numberOfDivisor(Long a) {
        Long p = a;
        int res = 1;
        Long mod = 2L;
        while(p!=1 || mod<=a){
            if(p%mod==0)res++;
            while(p%mod==0){
                p/=mod;
            }
            // System.out.println(mod);
            mod++;
        }
        return res;
    }
}
