import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            String ss = s.substring(i, i + 1);
            if (i != b - 1) {
                System.out.print(ss);
            } else {
                String tmp = ss.toLowerCase();
                System.out.print(tmp);
            }
        }
        System.out.println("");
        sc.close();
    }
}