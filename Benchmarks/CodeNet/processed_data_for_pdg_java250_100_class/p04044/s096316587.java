public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(input.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        String [] a = new String[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.readLine();
        }
        Arrays.sort(a);
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            out.append(a[i]);
        }
        System.out.println(out);
    }
}
