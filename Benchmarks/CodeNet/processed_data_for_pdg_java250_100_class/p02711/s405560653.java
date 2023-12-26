public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String N = br.readLine();
	System.out.println(N.contains("7") ? "Yes" : "No");
    }
}
