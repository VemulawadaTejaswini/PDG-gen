public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        String answer = "Yes";
        for (int i = 1; i <= len; i++) {
            char c = s.charAt(i - 1);
            if ((i % 2) == 0) {
                if ((c == 'L') || (c == 'U') || (c == 'D')) {
                    continue;
                } else {
                    answer = "No";
                    break;
                }
            }
            else {
                if ((c == 'R') || (c == 'U') || (c == 'D')) {
                    continue;
                } else {
                    answer = "No";
                    break;
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
