class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int  r = scanner.nextInt();
	  	int  c = scanner.nextInt();
	  	int[][] array;
        array = new int[r + 5][c + 5];
        for (int i = 0; i <= r; i++) {
        	for (int j = 0; j <= c; j++) {
        		array[i][j] = 0;
	        }
        }
        for (int i = 0; i < r; i++) {
        	for (int j = 0; j < c; j++) {
        		array[i][j] = scanner.nextInt();
	        }
        }
        for (int i = 0; i <= r; i++) {
        	for (int j = 0; j <= c; j++) {
	            if( j < c ) {
	            	array[i][c] += array[i][j];
	            }
	            if( i < r ) {
	            	array[r][j] += array[i][j];
	            }
	            if( i == r && j == c )
	        	  	array[r][c] /= 2;
        	}
        }
        for (int i = 0; i <= r; i++) {
        	for (int j = 0; j <= c; j++) {
	            if( j == c && i < r )
        			System.out.println(array[i][j] );
	            else if( j == c && i == r )
        			System.out.println(array[i][j]);
	            else
        			System.out.print(array[i][j] + " ");
	        }
        }
        scanner.close();
  }
}
