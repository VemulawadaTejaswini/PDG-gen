class Main {
    public static void main(String [] args){
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        int[] b = new int[m];
        for(int i = 0 ; i < n ; i++ ){
        	for(int j = 0 ; j < m ; j++ ){
        		A[i][j] = sc.nextInt();
        	}
        }
        for(int k = 0 ; k < m ; k++ ){
        	b[k] = sc.nextInt();
        }
        int x,y;
        int sum;
        for( x = 0 ; x < n ; x++ ){
        	sum = 0;
        	for(y = 0 ; y < m ; y++ ){
        		sum = sum + A[x][y] * b[y];
        	}
        System.out.println(sum);
        }
    }
}
