import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int five = 0;
        int seven = 0;
        int a = sc.nextInt();
        if(a == 5) five++;
        if(a == 7) seven++;
        int b = sc.nextInt();
        if(b == 5) five++;
        if(b == 7) seven++;
        int c = sc.nextInt();
        if(c == 5) five++;
        if(c == 7) seven++;
        if(five == 2 && seven == 1) System.out.println("YES");
        else System.out.println("NO");
    }
}