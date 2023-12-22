import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int b = sc.nextInt();
        if (a == 0)
            System.out.println(0);
        else if (a % 2 == 0)
            System.out.println(a / 2);
        else
            System.out.println((a / 2) + 1);
    }
}