public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int K = Integer.parseInt(br.readLine());
	String S = br.readLine();
	if (S.length() <= K) {
	    System.out.println(S);
	} else {
	    System.out.println(S.substring(0, K) + "...");
	}
    }
}
