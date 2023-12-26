public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        SortedSet<Integer> a = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(a.size());
    }
}
