public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String S = br.readLine();
	String T = br.readLine();
	if (T.length() == S.length() + 1 && T.substring(0, S.length()).equals(S)) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }
}
