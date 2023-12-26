    class Main{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
    int r, c, i, j, sum1 = 0, sum2 = 0;
    int data[][] = new int[150][150];
    r = scan.nextInt();
    c = scan.nextInt();
    for (i = 0; i < r; i++) {
        for (j = 0; j < c; j++) {
        	data[i][j] = scan.nextInt();
            sum1 += data[i][j];
        }
        data[i][c] = sum1;
        sum1 = 0;
    }
    for (j = 0; j <= c; j++) {
        for (i = 0; i < r; i++) {
            sum2 += data[i][j];
        }
        data[r][j] = sum2;
        sum2 = 0;
    }
    for (i = 0; i <= r; i++) {
        for (j = 0; j < c; j++) {
        	System.out.print(data[i][j] + " ");
        }
        System.out.println(data[i][c]);
    }
	}
}
