public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String line = br.readLine();
    	int x = Integer.parseInt(line);
    	int y = x*x*x;
    	System.out.println(y);
    }
}
