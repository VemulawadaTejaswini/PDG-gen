class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a < b) {
                System.out.println("a < b");
            }
            if (a > b) {
                System.out.println("a > b");
            }
            if (a == b) {
                System.out.println("a == b");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
