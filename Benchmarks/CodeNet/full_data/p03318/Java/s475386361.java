public class Main {

    public static void main(String[] args) {

        final long N = Long.MAX_VALUE;
        long k = Integer.valueOf(args[0]);
        long ki = 0;
        long i = 1;
        while(i < N && ki < k) {
            if(isSunuke(i)){
                System.out.println(i);
                ki++;
            }
            i++;
        }
    }

    private static long calcSn(long n) {
        long sn = 0;
        while(n > 0) {
            sn += n % 10;
            n = n / 10;
        }
        return sn;
    }

    private static boolean isSunuke(long n) {
        long n1 = n + 1;
        long sn = calcSn(n);
        long sn1 = calcSn(n1);

        return n * sn1 <= n1 * sn;
    }

}
