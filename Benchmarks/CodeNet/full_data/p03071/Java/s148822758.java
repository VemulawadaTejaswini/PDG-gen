import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner Ent = new Scanner(System.in);
        int a = Ent.nextInt();
        int b = Ent.nextInt();
        int suma1 = 2*a - 1;
        int suma2 = 2*b - 1;
        int suma3 = a + b;
        System.out.println(Math.max(suma1, Math.max(suma2, suma3)));
    }
}
