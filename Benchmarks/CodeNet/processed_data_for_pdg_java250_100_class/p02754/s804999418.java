public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ballCnt = 0;
        if( a > 0 ) {
            long divisionAns = n / ( a + b );
            long remainderOfDivision = n % ( a + b );
            ballCnt += divisionAns * a;
            ballCnt += remainderOfDivision < a ? remainderOfDivision : a;
        }
        System.out.println( ballCnt );
        sc.close();
    }
}
