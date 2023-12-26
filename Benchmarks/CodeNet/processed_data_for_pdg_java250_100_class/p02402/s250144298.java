class Main{
      	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int a;
    	int min = 0;
    	int max = 0;
    	for(int i = 0; i < n; i++){
    	    a = scan.nextInt();
    	    if(i == 0) {
    	    	min = a;
    	    	max = a;
    	    }
	    if(min > a){
		min = a;
	    }
	    if(max < a){
		max = a;
	    }
    	    sum += a;
    	}
    	System.out.println(min + " " + max + " " + sum);
     }
}
