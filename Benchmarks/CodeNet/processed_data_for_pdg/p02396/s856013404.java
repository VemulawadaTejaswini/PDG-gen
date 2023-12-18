public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        int i = 1;
        while (true) {
            int data = Integer.parseInt(br.readLine());
            if (data == 0)
                break;
            System.out.println("Case " + i + ": " + data);
            i++;
        }
    }
}
