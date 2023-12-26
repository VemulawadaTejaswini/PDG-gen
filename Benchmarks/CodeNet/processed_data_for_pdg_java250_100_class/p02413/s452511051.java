public class Main{
    public static void main(String args[]){
	Scanner in =new Scanner(System.in);
	int r,c;
	r = in.nextInt();
	c = in.nextInt();
	int[][] table = new int[r+1][c+1];
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
		table[i][j] = in.nextInt();
	    }
	}
	for(int i=0;i<r;i++){
	    table[i][c]=0;
	}
	for(int j=0;j<c;j++){
	    table[r][j]=0;
	}
	table[r][c]=0;
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
	        table[i][c]+=table[i][j];
	    }
	}
	for(int j=0;j<c;j++){
	    for(int i=0;i<r;i++){
	        table[r][j]+=table[i][j];
	    }
	}
	for(int i=0;i<r;i++){
	    table[r][c]+=table[i][c];
	}
	for(int i=0;i<=r;i++){
	    for(int j=0;j<=c;j++){
		System.out.print(table[i][j]);
		if(j!=c)System.out.print(" ");
	    }
	    System.out.println();
	}
    }
}
