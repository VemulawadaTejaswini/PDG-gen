class Main {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    while(true){
		String s1 = sc.next();
	        int H = Integer.parseInt(s1);
	        String s2 = sc.next();
	        int W = Integer.parseInt(s2);
	        if(H <= 300 && W <= 300){
	            if(H == 0 && W == 0){
	        	    break;
	            }
	            for(int i = 1; i <= H; i++){
	        	    for(int j = 1; j <= W; j++){
	        		    System.out.print("#");
	        	    }
	        	    System.out.println("");
	            }
                    System.out.println("");
	        }
	    }
	}
}
