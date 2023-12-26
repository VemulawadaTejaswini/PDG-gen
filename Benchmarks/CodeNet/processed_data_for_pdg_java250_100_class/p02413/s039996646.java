class Main {
    public static void main(String [] args){
    	Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] num = new int[r+1][c+1];
        for( int i = 0 ; i < r ; i++ ){
        	for ( int j = 0 ; j < c ; j++ ){
        		num[i][j] = sc.nextInt();
        		num[r][j] = num[r][j] + num[i][j];
        		num[i][c] = num[i][c] + num[i][j];
        	}
        }
    	for ( int j = 0 ; j < c ; j++ ){
    		num[r][c] = num[r][c] + num[r][j];
    	}
       for( int i = 0 ; i < r+1 ; i++ ){
        	for ( int j = 0 ; j < c+1 ; j++ ){
        		if(j == 0){
        			System.out.print(num[i][j]);
        		}else{
        			System.out.print(" " + num[i][j]);
        		}
        	}
        	System.out.println();
        }
    }
}
