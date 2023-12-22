import java.util.* ;

public class Main {
	
	public static void main( String[] args ) {
		Scanner sc			= new Scanner( System.in ) ;
		int		N			= sc.nextInt();
		int		M			= sc.nextInt();
		int		field[][]	= new int[M][3];

		for( int q = 0; q < M; q++ ) {
			for( int p = 0; p < 3; p++ ) {
				field[q][p] = sc.nextInt() ;
			}
		}

		HashMap<String, Integer> matrix = new HashMap<String, Integer>() ;
		for( int index = 0; index < M; index++ ) {
			String info = String.valueOf(field[index][0]) + "," + String.valueOf(field[index][1]) ;
			matrix.put(info, field[index][2]);
			info = String.valueOf(field[index][1]) + "," + String.valueOf(field[index][0]) ;
			matrix.put(info, - field[index][2]);
		}
		
		int max = 0 ;
		for( int q = 0; q < N; q++ ) {
			for( int p = 0; p < N; p++ ) {
				for( int index = 0; index < N; index++ ) {
					String pass1 = q + "," + index ;
					String pass2 = index + "," + p ;
					String pass3 = q + "," + p ;
					if( matrix.containsKey(pass1) && matrix.containsKey(pass2) && matrix.containsKey(pass3) ){
						if( matrix.get(pass1) + matrix.get(pass2) != matrix.get(pass3) ) {
							System.out.println("No") ;
							return ;
						}
					}
					if( matrix.containsKey(pass3) && matrix.get(pass3) > max ) {
						max = matrix.get(pass3) ;
					}
				}
			}
		}
		if( max > 1_000_000_000 ) {
			System.out.println("No") ;
			return ;
		}
		
		System.out.println("Yes") ;
	}
}
