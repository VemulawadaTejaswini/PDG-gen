public class Main {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int i = Integer.parseInt(s);
        i *= i * i;
        System.out.println(i);
    }
}
