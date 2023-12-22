import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] ab = new int[n][2];
		for(int i = 0; i < ab.length; i++){
			for(int j = 0; j < ab[i].length; j++){
				ab[i][j] = sc.nextInt();
			}
		}
		
		int min = Integer.MAX_VALUE;
		int posi = 0;
		long sum = 0L;
		while(true){
			for(int i = 0; i < ab.length; i++){
				if( ab[i][0] < min ){
					min = ab[i][0];
					posi = i;
				}
			}
			if( ab[posi][1] < m){
				sum += (long)ab[posi][0] * (long)ab[posi][1] ;
			}else{
				sum += (long) m * (long)ab[posi][0];
			}
			m -= ab[posi][1] ;
			if( m <= 0 ){
				break;
			}
			ab[posi][0] = Integer.MAX_VALUE;
			min = Integer.MAX_VALUE;
		}
		System.out.println(sum);
	}
}