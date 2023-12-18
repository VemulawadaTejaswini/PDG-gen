public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println(Arrays.toString(IntStream.of(s.nextInt(), s.nextInt(), s.nextInt()).sorted().toArray()).replaceAll("[\\[\\],]", ""));
    }
}
