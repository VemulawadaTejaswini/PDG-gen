public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] charArray = sc.next().toCharArray();
        for (char c: charArray) {
            if (c == '7') {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
