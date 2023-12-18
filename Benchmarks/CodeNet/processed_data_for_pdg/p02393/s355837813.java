public class Main {
	public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			input = br.readLine();
			br.close();
		} catch (IOException e) {
		}
		String [] abc = input.split(" ");
		int a = Integer.parseInt(abc[0]);
		int b = Integer.parseInt(abc[1]);
		int c = Integer.parseInt(abc[2]);
	    if (a > b){
	        int tem = a;
	        a = b;
	        b = tem;
	    }
	    if (a > c){
	        int sam = a;
	        a = c;
	        c = sam;
	    }
	    if (b > c){
	        int dam = b;
	        b = c;
	        c = dam;
	    }
	    System.out.println(a + " " + b + " " + c);
	}
}
