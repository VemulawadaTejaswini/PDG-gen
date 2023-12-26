public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> s = new HashSet<>();
        while (n-- > 0) {
            String a = br.readLine();
            s.add(a);
        }
        br.close();
        System.out.println(s.size());
    }
}
