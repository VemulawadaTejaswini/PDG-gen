import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
      	double ab = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
      	double cc = Math.sqrt(c);
        if (ab < cc)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}