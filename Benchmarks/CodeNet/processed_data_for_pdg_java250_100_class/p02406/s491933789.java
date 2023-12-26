class Main {
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String s1 = sc.next();
        int n = Integer.parseInt(s1);
        if(3 <= n && n <= 10000){
        	for(int i = 1; i <= n; i++){
        		if(i % 3 == 0){
        			System.out.print(" " + i);
        		}
        		else if(i % 10 == 3){
        			System.out.print(" " + i);
        		}
        		else{
        		    String si = String.valueOf(i);
        		    for(int j = 0; j < si.length() - 1; j++){
        			   char ci = si.charAt(j);
        			   if(ci == '3'){
        				   System.out.print(" " + i);
        				   break;
        			   }
        		    }
        		}
        	}
        	System.out.println("");
        }
    }
}
