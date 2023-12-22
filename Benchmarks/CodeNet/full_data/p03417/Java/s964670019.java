 public static void Main (String[] args) {    	    	
	    int N, M, back = 0;
	    Scanner sc = new Scanner(System.in);
	    N = sc.nextInt(); M = sc.nextInt();
	    
		int grid[][] = new int [N][M];
	
		for(int i=0; i<grid.length; i++)
			for(int j=0; j<grid[i].length; j++) {
				for(int k=-1; k<=1; k++)
					for (int l=-1; l<=1; l++) {
						if (i+k >= N || i+k < 0 || j+l >= M || j+l < 0)						
							continue;
						if (grid[i+k][j+l] == 0)
							grid[i+k][j+l]= 1;
						else 
							grid[i+k][j+l]= 0;
					}

			}

		for(int i=0; i<grid.length; i++)
			for(int j=0; j<grid[i].length; j++)
				if (grid[i][j]==1)
					back++;
		
		System.out.println(back);			
		sc.close();				
}