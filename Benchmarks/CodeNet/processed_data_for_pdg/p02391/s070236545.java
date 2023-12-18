public class Main {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String buf = br.readLine();
    String[] x = buf.split(" ",0);
    	int a = Integer.parseInt(x[0]);
    	int b = Integer.parseInt(x[1]);
    	if(a<b)
          System.out.println("a < b"); 
    	else if(a>b)
          System.out.println("a > b"); 
    	else if(a==b)
          System.out.println("a == b"); 
    }
}
