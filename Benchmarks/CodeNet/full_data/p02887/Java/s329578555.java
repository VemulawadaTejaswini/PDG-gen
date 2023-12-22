import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b=sc.next();
        String[] c=b.split("");
        int answer = 1;
        for (int i = 0; i < a; i++) {
            if (i >= 1) {
                if (!(c[i].equals(c[i - 1]))) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

}
