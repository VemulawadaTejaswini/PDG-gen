public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int[] i = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt)
                                                .toArray();
        if (i[0] < i[1]) {
            System.out.println("a < b");
        } else if (i[0] > i[1]) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }
    }
}
