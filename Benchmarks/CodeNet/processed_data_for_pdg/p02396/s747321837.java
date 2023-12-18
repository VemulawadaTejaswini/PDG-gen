public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (!list.contains(0)) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.println("Case " + (i + 1) + ": " + list.get(i));
        }
        sc.close();
    }
}
