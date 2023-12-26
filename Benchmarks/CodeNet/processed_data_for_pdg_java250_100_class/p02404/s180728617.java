public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		while(true){
		int H = scan.nextInt();
	    int W = scan.nextInt();
	    if(H == 0 && W == 0)break;
	    for(int i = 1;i <= H ;i++){
	    	for(int j = 1;j <= W; j++){
	    		if((i == 1 || j == 1) || i == H || j == W){
	    			System.out.print("#");
	    		}else{
	    			System.out.print(".");
	    		}
	    	}
	    	System.out.println();
	    }
	    System.out.println();
	   }
	}
}
