public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> list = new LinkedHashSet<String>();
        for (int i = 0; i < N; i++) {
            String a = sc.next();
            list.add(a);
        }
        System.out.println(list.size());
    }
}
