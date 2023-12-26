public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[N];
        String ans = "";
        for (int i = 0; i < N; i++) {
            strs[i] = sc.nextLine();
        }
        Arrays.sort(strs);
        for (String string : strs) {
            ans += string;
        }
        System.out.println(ans);
    }
}
