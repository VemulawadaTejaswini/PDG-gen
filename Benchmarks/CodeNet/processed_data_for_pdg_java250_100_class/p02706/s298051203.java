public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int result = 0;
        for( int i = 0; i < m; i++ ) {
            a[i] = sc.nextInt();
            result += a[i];
        }
        System.out.println( result > n ? "-1" : n - result );
        sc.close();
    }
}
