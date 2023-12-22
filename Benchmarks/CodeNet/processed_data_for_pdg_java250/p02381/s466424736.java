public class Main {
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );
		while( true ) {
			int studentNum = scan.nextInt();
			if ( studentNum == 0 ) {
				break;
			}
			int[] point = new int[studentNum];
			int sum = 0;
			for( int i = 0; i < studentNum; i++ ) {
				point[i] = scan.nextInt();
				sum += point[i];
			}
			double average = (double)sum / (double)studentNum;
			double variance = 0;
			for( int i = 0; i < studentNum; i++ ) {
				double deviation	=	point[i]	- average;
				variance			+=	deviation	* deviation;
			}
			variance = variance / studentNum;
			double standardDeviation = Math.sqrt( variance );
			System.out.println( standardDeviation );
		}
	}
}
