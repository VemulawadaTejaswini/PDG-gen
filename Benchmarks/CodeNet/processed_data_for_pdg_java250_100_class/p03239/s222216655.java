public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int time=sc.nextInt();
		int c[][]=new int[n][2];
		for(int i=0;i<n;i++) {
			c[i][0]=sc.nextInt();
			c[i][1]=sc.nextInt();
		}
		int min=1001;
	    for(int i=0;i<n;i++) {
	    	if(c[i][1]<=time) {
	    		if(min>c[i][0]) {
	    			min=c[i][0];
	    		}
	    	}
	    }
	    if(min==1001)
	    	System.out.println("TLE");
	    else
	    	System.out.println(min);
	}
}
