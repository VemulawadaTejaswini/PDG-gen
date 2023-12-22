import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Long N = sc.nextLong();
        Long A = sc.nextLong();
        Long B = sc.nextLong();
        if(N>=A){
            System.out.println(A);
        } else {
            System.out.println(N);
        }
    }
}