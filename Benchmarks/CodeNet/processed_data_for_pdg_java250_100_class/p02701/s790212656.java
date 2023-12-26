public class Main {
    public static void main(String... args) throws IOException {
        int n;
        Set<String> s = new HashSet<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line;
        line = bf.readLine();
        n = Integer.parseInt(line);
        for (int i = 0; i < n; i++) {
            line = bf.readLine();
            s.add(line);
        }
        System.out.println(s.size());
    }
}
