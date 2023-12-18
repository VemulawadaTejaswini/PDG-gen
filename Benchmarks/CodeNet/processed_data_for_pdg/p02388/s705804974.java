public class Main{
    public static void main(String[] args) {
        String line;
        int x;
        int u;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
                       line = reader.readLine();
            x = Integer.parseInt(line);
            u = x * x * x;
            System.out.println(u);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
