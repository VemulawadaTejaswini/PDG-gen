public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader reader =
            new BufferedReader (new InputStreamReader (System.in));
        int N = Integer.parseInt (reader.readLine());
        System.out.println (Math.floor ((N + 1) / 2) / N);
        return;
    }
}
