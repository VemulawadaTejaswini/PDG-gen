import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N*500 >= sc.nextInt()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// cool function

//     public static boolean isPrime(int n) {
//        return !new String(new char[n]).matches(".?|(..+?)\\1+");
//    }
