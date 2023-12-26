public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String S = br.readLine();
	char array[] = S.toCharArray();
	Arrays.sort(array);
	if (array[0] == array[1] && array[1] != array[2] && array[2] == array[3])
	    System.out.println("Yes");
	else
	    System.out.println("No");
    }
}
