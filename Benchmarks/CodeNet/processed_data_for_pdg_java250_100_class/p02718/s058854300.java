public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        double m = sc.nextDouble();
        Integer[] a = new Integer[n];
        int votesAllNum = 0;
        for( int i = 0; i < n; i++ ) {
            a[i] = sc.nextInt();
            votesAllNum += a[i];
        }
        Arrays.sort( a, Collections.reverseOrder() );
        double votesNum = votesAllNum / ( 4 * m );
        int cnt = 0;
        String result = "No";
        for( int i = 0; i < n; i++ ) {
            if( a[i] >= votesNum ) {
                cnt++;
                if( cnt >= m ) {
                    result = "Yes";
                    break;
                }
            }
        }
        System.out.println( result );
        sc.close();
    }
}
