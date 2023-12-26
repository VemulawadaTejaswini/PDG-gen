public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int num = 0;
        for (int i = 0; i < 4; i++) {
            char c = s.charAt(i);
            if (c == '+') {
                num++;
            } else {
                num--;
            }
        }
        int result = num;
        System.out.println(result);
    }
}
