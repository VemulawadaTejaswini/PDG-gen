import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int total = n1 + n2 + n3;

        if (total >= 22)
            System.out.println("bust");
        else
            System.out.println("win");
    }
}
