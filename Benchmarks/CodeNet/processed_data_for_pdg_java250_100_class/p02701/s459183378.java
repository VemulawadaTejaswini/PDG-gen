public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        Set<String> sSet = new HashSet<>(Arrays.asList(s));
        System.out.println(sSet.size());
    }
}
