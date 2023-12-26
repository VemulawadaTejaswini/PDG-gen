public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char ch[] = br.readLine().toCharArray();
	if (Character.isUpperCase(ch[0])) {
	    System.out.println("A");
	} else {
	    System.out.println("a");
	}
    }
}
