public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        String str = s.next();
        char c[] = str.toCharArray();
        if(c.length>d) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < d; i++) {
                sb.append(c[i]);
            }
            sb.append("...");
            System.out.println(sb.toString());
        } else {
            System.out.println(str);
        }
    }
}
