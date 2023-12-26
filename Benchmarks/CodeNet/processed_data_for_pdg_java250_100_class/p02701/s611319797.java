public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> s = new HashSet<>();
        for (int i = 0; i < n; i++){
            String a = sc.next();
            s.add(a);
        }
        int out = s.size();
        System.out.println(out);
    }
}
