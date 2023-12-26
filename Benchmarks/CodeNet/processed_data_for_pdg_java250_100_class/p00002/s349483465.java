public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            StringTokenizer st;
            while (s != null) {
                st = new StringTokenizer(s);
                int p =Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) ;
                System.out.println((int)Math.log10(p)+1);
                s =br.readLine();
            }
        } catch (Exception ex) {
            System.exit(0);
        }
    }
}
