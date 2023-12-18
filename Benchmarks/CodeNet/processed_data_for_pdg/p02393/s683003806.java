public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> numList = new ArrayList<>(Arrays.asList(a, b, c));
        Collections.sort(numList);
        String displayNumber = numList.stream().map(Object::toString).collect(Collectors.joining(" "));
        System.out.println(displayNumber);
    }
}
