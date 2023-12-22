import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] N=sc.next().toCharArray();

        for (char c : N) {
            if(c=='7'){
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
        sc.close();
    }
}