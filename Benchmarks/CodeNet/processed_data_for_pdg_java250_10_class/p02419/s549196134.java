class Main {
	public static void main(String[] args) {
		Scanner as = new Scanner(System.in);
		String T = "";
		String W;
		String str = "";
		int count = 0;
		W = as.nextLine();
		W = W.toLowerCase();
	    while(as.hasNext()){                  
	    	T = as.next();
	    	T = T.toLowerCase();
	    	if(T.indexOf(W) == 0 && T.lastIndexOf(W) == 0){
	    		count++;
	    	}
        }
	    str = String.valueOf(count);
	    System.out.println(str);
	}
}
