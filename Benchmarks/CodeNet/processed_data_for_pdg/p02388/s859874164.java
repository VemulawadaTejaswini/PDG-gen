class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            if (num < 1 || num > 100) {
                System.out.println("Err!");
                return;
            }
            int answer = num * num * num;
            System.out.println(answer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
