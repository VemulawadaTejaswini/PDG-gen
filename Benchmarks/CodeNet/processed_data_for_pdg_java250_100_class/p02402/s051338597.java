class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
	    int n = Integer.parseInt(s1);
	    int a[] = new int[n];
	    long sum = 0;
	    for(int i = 0; i <= n-1; i++){
	    	String s2 = sc.next();
		    int j = Integer.parseInt(s2);
		    a[i] = j;
	    }
	    for(int i = 0; i <= a.length-1; i++){
	    	for(int j = 0; j <= a.length-2; j++){
	    		if(a[j] < a[j+1]){
	    			int w = a[j];
	    			a[j] = a[j+1];
	    			a[j+1] = w;
	    		}
	    	}
	    }
	    for(int i = 0; i < a.length; i++){
	    	sum = sum + (long)a[i];
	    }
	    System.out.println(a[a.length-1] + " " + a[0] + " " + sum);
	}
}
