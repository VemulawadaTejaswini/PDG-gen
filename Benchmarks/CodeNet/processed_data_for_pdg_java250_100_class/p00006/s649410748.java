public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int len = line.length();
            char[] str = new char[len];
            len--;
            for (char c : line.toCharArray()) {
                str[len--] = c;
            }
            System.out.println(new String(str));
        }
    }
}
