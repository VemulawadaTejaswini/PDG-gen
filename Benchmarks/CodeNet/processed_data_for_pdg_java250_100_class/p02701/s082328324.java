public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap map = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), i);
        }
        System.out.println(map.size());
    }
}
