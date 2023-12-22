import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String U = sc.next();
        if(S.equals(U)){
            System.out.printf("%d %d", a-1, b);
        }else{
            System.out.printf("%d %d", a, b-1);
        }
        return;
    }
}