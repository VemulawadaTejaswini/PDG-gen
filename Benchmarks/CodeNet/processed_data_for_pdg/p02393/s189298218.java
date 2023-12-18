public class Main {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String buf = br.readLine();
    String[] x = buf.split(" ",0);
    	int a = Integer.parseInt(x[0]);
    	int b = Integer.parseInt(x[1]);
    	int c = Integer.parseInt(x[2]);
    	if(a>b){
    		int temp = a;
    		    a = b;
    		    b =temp;
    	}
    	if(a>c){
    		int temp = a;
    		    a = c;
    		    c =temp;
    	}
    	if(b>c){
    	    int temp = b;
    		    b = c;
    		    c =temp;
    	}
        System.out.println(a + " " + b +" "+c); 
    }
}
