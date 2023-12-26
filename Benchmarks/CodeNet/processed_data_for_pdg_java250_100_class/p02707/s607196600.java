public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int[] a = new int[n];
        for( int i = 1; i < n; i++ ) {
            int member = sc.nextInt();
            a[member - 1]++;
        }
        for( int i = 0; i < n; i++ ) {
            System.out.println( a[i] );
        }
        sc.close();
    }
}
