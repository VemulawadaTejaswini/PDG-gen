class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            int a = Integer.parseInt(line);
            int triple = a * a * a;
            System.out.println(triple);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
