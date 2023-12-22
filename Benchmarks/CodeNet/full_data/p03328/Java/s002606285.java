import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = b - a;
        int bb = ((n + 1) * n) / 2;
        System.out.println(bb - b);
    }
}
