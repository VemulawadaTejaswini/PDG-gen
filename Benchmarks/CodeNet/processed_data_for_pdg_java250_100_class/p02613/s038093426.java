public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();   
        int totalAcCnt = 0;
        int totalWaCnt = 0;
        int totalTleCnt = 0;
        int totalReCnt = 0;
        for( int i = 0; i < n; i++ ) {
            String s = sc.next();
            if( s.equals( "AC" ) ) ++totalAcCnt;
            else if( s.equals( "WA" ) ) ++ totalWaCnt;
            else if( s.equals( "TLE" ) ) ++ totalTleCnt;
            else ++totalReCnt;
        }
        StringBuffer sb = new StringBuffer();
        sb.append( "AC x " ).append( totalAcCnt );
        sb.append( "\nWA x " ).append( totalWaCnt );
        sb.append( "\nTLE x " ).append( totalTleCnt );
        sb.append( "\nRE x " ).append( totalReCnt );
        System.out.println( sb.toString() );
        sc.close();
    }
}
