class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int  a = scanner.nextInt();
	  	int  b = scanner.nextInt();
	  	int[][] array;
        array = new int[a][b];
        int Vec[] = new int[b];  
        int sum[] = new int[a];
        int x = 0;
        for (int i = 0; i < a; i++) {
        	for (int j = 0; j < b; j++) {
	            array[i][j]=scanner.nextInt();
	        }
        }
        for (int i = 0; i < b; i++) {
	            Vec[i]=scanner.nextInt();
	     }
        for (int i = 0; i < a; i++) {
        	for (int j = 0; j < b; j++) {
	            sum[i] = array[i][j] * Vec[j] + x;
	            x = sum[i];
	        }
	        x = 0;
        }
        for (int i = 0; i < a; i++) {
	            System.out.println(sum[i]);
	     }
        scanner.close();
  }
}
