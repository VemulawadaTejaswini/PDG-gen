public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	final int A = Integer.parseInt(str);
    	str = br.readLine();
    	final int B = Integer.parseInt(str);
    	str = br.readLine();
    	final int C = Integer.parseInt(str);
    	str = br.readLine();
    	final int D = Integer.parseInt(str);
    	str = br.readLine();
    	final int E = Integer.parseInt(str);
    	str = br.readLine();
    	final int K = Integer.parseInt(str);
    	boolean communicationAvailable = false;
    	if (E - A <= K) {
    		communicationAvailable = true;
    	}
    	if (communicationAvailable) {
    		System.out.println("Yay!");
    	} else {
    		System.out.println(":(");
    	}
    }
}
