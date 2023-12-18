public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int ss = a * b;
        int u = (a * 2) + (b * 2);
        System.out.println(ss + " " + u);
    }
}
