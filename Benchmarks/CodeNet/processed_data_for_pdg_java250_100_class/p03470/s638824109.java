public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            d.add(sc.nextInt());
        }
        List<Integer> d_new = new ArrayList<>(new HashSet<>(d));
        System.out.println(d_new.size());
    }
}
