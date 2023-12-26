public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> box = new ArrayList<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            box.add(sc.next());
        }
        List<String> list = new ArrayList<String>(new LinkedHashSet<>(box));
        System.out.println(list.size());
    }
}
