public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader reader =
            new BufferedReader (new InputStreamReader (System.in));
        String S = reader.readLine();
        Boolean flg = false;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt (i - 1) == S.charAt (i)) {
                flg = true;
                break;
            }
        }
        System.out.println (flg ? "Bad" : "Good");
        return;
    }
}
