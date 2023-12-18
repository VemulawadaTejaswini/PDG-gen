public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt());
        String print = nums.stream().sorted().map(x -> String.valueOf(x)).collect(Collectors.joining(" "));
        System.out.println(print);
        sc.close();
    }
}
