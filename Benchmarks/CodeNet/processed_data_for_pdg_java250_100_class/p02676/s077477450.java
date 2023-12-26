public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(in.readLine());
        String input = in.readLine();
        if (k < input.length()) {
            System.out.print(input.substring(0, k) + "...");
        } else {
            System.out.print(input);
        }
    }
}
