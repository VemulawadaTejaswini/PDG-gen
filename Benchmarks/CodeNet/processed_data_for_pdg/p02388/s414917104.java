public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int accept = Integer.valueOf(br.readLine());
        System.out.println(accept*accept*accept);
    }
}
