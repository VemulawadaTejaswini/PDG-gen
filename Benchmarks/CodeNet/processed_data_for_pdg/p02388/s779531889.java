public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader sR = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(sR.readLine());
        x *= x *= x;
        System.out.println(x);
    }
}
