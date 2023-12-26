class Main {
    public static void main(String[] a) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = r.readLine();
            StringTokenizer st;
            while(s != null) {
                st = new StringTokenizer(s);
                int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
                System.out.println((int)Math.log10(sum) + 1);
                s = r.readLine();
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }
}
