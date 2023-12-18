public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        List<String> lists = Arrays.asList(br.readLine().split(" "));
        System.out.println(lists.stream().sorted(Comparator.naturalOrder())
            .collect(Collectors.joining(" ")));
    }
}
