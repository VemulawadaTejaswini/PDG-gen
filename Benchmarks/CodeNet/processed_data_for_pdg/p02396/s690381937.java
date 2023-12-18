public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();
        while (true) {
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            } else {
                numList.add(i);
            }
        }
        for (int i = 0; i < numList.size(); i++) {
            System.out.println("Case " + (i + 1) + ": " + numList.get(i));
        }
    }
}
