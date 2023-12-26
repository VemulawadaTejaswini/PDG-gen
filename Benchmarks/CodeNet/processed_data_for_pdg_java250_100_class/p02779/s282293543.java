public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }
        String result = n == a.size() ? "YES" : "NO";
        System.out.println(result);
        sc.close();
    }
}
