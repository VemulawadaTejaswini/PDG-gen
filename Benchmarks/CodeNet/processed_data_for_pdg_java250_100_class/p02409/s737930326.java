class Main {
    public static void main(String [] args){
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][][] bill = new int[4][3][10];
        int b ;
        int f ;
        int r ;
        int v = 0;
        for( int i = 0 ; i < n ; i++ ){
	        b = sc.nextInt();
	        f = sc.nextInt();
	        r = sc.nextInt();
	        v = sc.nextInt();
	        bill[b-1][f-1][r-1] = bill[b-1][f-1][r-1] + ( v );
        }
        for(int j = 0 ; j < 4 ; j++ ){
        	for( int k = 0 ; k < 3 ; k++ ){
        		for( int l = 0 ; l < 10 ; l++ ){
        			System.out.print(" " + bill[j][k][l]);
        		}
        		System.out.println();
        	}
        	if( j != 3){
        	System.out.println("####################");
        	}
        }     
    }
}
