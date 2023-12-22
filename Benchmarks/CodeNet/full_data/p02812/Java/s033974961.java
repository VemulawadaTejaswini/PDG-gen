import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        String[] c = b.split(b);
        int answer = 0;
        for (int i = 0; i < a; i++) {
            if (i >= 3) {
                if (b.substring(i - 3, i).equals("ABC")) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
