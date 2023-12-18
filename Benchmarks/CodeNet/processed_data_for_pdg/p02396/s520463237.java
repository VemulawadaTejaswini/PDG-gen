class Main {
    public static void main(String[] args) {
        int i = 1;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true) {
            try {
                s = bf.readLine();
                if (s.equals("0")) {
                    break;
                } else {
                    System.out.printf("Case %d: %s\n", i++, s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
