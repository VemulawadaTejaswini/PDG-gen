public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(in.readLine());
        double b = 3;
        System.out.println((int) Math.pow(a, b));
    }
}
