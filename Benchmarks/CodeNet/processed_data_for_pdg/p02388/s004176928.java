public class Main {
    public static void main(String[] args){
    	try {
	    	InputStreamReader isr = new InputStreamReader(System.in);
	    	BufferedReader br = new BufferedReader(isr);
	    	String x = br.readLine();
	    	int x_int = Integer.parseInt(x);
	    	int ans = 0;
	    	if(x_int >= 1 || x_int <= 100) {
	    		ans = x_int * x_int * x_int;
	    	}
	    	System.out.println(ans);
    	} catch (IOException e) {
    		System.out.println(e);
		}
    }
}
