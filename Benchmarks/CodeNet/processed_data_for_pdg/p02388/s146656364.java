public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int x = Integer.parseInt(input);
        System.out.println((int) Math.pow(x, 3));
    }
}
