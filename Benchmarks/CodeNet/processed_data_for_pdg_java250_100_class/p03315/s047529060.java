public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] array = s.toCharArray();
        int result = 0;
        for (char c : array) {
            result += c == '+' ? 1 : -1;
        }
        System.out.println(result);
        sc.close();
    }
}
