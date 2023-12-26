public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String S = br.readLine();
	String T = br.readLine();
	int result = 0;
	for (int i = 0; i < 3; i++) {
	    if (S.charAt(i) == T.charAt(i))
		result++;
	}
	System.out.println(result);
    }
}
