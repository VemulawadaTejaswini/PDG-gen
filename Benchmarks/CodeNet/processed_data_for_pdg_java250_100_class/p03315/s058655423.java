public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ary = sc.next().toCharArray();
        int ans = 0;
        for (int i = 0; i < 4; i++) {
            if (ary[i] == '+') {
                ans++;
            } else {
                ans--;
            }
        }
        sc.close();
        System.out.println(ans);
    }
}
