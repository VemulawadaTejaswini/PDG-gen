class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int x = Integer.parseInt(s);
        int y = x * x * x;
        System.out.println(y);
    }
}
