public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        Arrays.sort(str);
        System.out.println(String.join(" ", str));
    }
}
