public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch[] = sc.next().toCharArray();
        int cnt = 0;
        for (char c : ch) {
            cnt += c == '+' ? 1 : -1;
        }
        System.out.println(cnt);
    }
}
