public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            if (c[0] == '0') { break; }
            int sum = 0;
            for (int i = 0; i < s.length(); i ++) { sum += c[i] - '0'; }
            System.out.println(sum);
        }
    }
}
