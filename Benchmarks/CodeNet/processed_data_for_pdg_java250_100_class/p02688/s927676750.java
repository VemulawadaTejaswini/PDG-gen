public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < k; i++) {
            int d = Integer.parseInt(sc.next());
            for (int j = 0; j < d; j++) {
                hs.add(Integer.parseInt(sc.next()));
            }
        }
        int answer = n - hs.size();
        System.out.println(answer);
        sc.close();
    }
}
