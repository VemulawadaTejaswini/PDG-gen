class Main {
	public static void main(String[] args) {
Scanner as = new Scanner(System.in);
		String T = "";
		String TD;
		String W;
		String str = "";
		int j = 0;
		int i = 0;
		int k = 0;
		int count = 0;
		int same = 0;
		int flag = 0;
		W = as.nextLine();
		W = W.toLowerCase();
	    while(as.hasNext()){                  
	    	T = as.next();
	    	T = T.toLowerCase();
	    	if(T == "END_OF_TEXT"){
	    		break;
	    	}
	    	if(T.indexOf(W) == 0 && T.lastIndexOf(W) == 0){
	    		count++;
	    	}
        }
	    str = String.valueOf(count);
	    System.out.println(str);
	}
}
