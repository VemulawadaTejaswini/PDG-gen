import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
      	double a1 = a + b + 2 * Math.sqrt(a*b);
      	double cc = c;
        if (a1 < cc)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}