public class Main {

    public static void main(String[] args) {

        final int N = 1000000000;
        int k = 10;
        int ki = 0;
        int i = 1;
        while(i < N && ki < k) {
            if(isSunuke(i)){
                System.out.println(i);
                ki++;
            }
            i++;
        }
    }

    private static int calcSn(int n) {
        int sn = 0;
        while(n > 0) {
            sn += n % 10;
            n = n / 10;
        }
        return sn;
    }

    private static boolean isSunuke(int n) {
        int n1 = n + 1;
        int sn = calcSn(n);
        int sn1 = calcSn(n1);

        return n * sn1 <= n1 * sn;
    }

}