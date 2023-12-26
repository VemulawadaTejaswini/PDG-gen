class Main {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.next();
	    int a = Integer.parseInt(s1);
	    String s2 = sc.next();
	    int b = Integer.parseInt(s2);
	    double p = Math.pow(10, 9);
	    if(1 <= a && a <= p){
	    	if(1 <= b && b <= p){
	    		int d = a / b;
	    		int r = a % b;
	    		double f = (double)a / (double)b;
	    		System.out.println(d + " " + r + " " + String.format("%1$3f",f));
	    	}
	    }
	}
}
