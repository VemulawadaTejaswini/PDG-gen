public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();
            final int len = s.length();
            int cnt = 0;
            for (int i = 0; i < len; i++) {
                if (s.charAt(i) == '+') cnt++;
                else cnt--;
            }
            System.out.println(cnt);
        }
    }
}
