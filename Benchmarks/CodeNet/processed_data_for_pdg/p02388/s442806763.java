class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            int x = Integer.parseInt(line);
            int a = x*x*x;
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
