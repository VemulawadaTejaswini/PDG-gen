import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), P = sc.nextInt();
        int total = A * 3 + P;

        System.out.println(total/2);
    }
}