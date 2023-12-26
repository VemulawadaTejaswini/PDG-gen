public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader reader =
            new BufferedReader (new InputStreamReader (System.in));
        int N = Integer.parseInt (reader.readLine());
        String S = reader.readLine();
        System.out.println (
            N % 2 == 0 ? S.substring (0, N / 2).equals (S.substring (N / 2))
                             ? "Yes"
                             : "No"
                       : "No");
        return;
    }
}
