public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = (s.length() - s.replace("+", "").length()) -
                (s.length() - s.replace("-", "").length());
        System.out.println(ans);
    }
}
