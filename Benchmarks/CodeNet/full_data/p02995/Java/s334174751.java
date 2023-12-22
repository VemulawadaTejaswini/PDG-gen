import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

            long A = sc.nextLong();
            long B = sc.nextLong();
            long C = sc.nextLong();
            long D = sc.nextLong();

            long sum = 0;

            if(A%C == 0) {
                sum += B/C - A/C + 1;
            } else {
                sum += B/C - A/C;
            }

            if(A%D == 0) {
                sum += B/D - A/D + 1;
            } else {
                sum += B/D - A/D;
            }

            long lcm = Lcm.lcm(C,D);

            long lcmsum;
            if(lcm == -1) {
                lcmsum = 0;
            } else if(A%lcm == 0 ) {
                lcmsum = B/lcm - A/lcm + 1;
            } else {
                lcmsum = B/lcm - A/lcm;
            }
        System.out.println(B - A + 1 - sum + lcmsum);
    }
}

//import java.util.*;

class Lcm {
    //gcd 最大公約数
    public static long gcd(long m, long n) {
        if(m < n) return gcd(n,m);
        if(n == 0) return m;
        return gcd(n,m%n);
    }

    public static long lcm(long m, long n) {
        return m * n / gcd(m,n);
    }
}