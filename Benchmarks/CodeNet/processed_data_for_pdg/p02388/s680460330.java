public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word;
        try {
            word = reader.readLine();
            int num = Integer.parseInt(word);
            int ans = num * num * num;
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
