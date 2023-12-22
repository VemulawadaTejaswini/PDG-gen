import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,P;
        A = sc.nextInt();
        P = sc.nextInt();
        int ans = (A*3+P)/2;
        System.out.println(ans);
    }
}

