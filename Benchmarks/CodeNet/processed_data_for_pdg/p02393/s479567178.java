public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        List<String> lists = Arrays.asList(br.readLine().split(" "));
        lists.sort((e1, e2) -> e1.compareTo(e2));
        System.out.println(String.join(" ", lists));
    }
}
