import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long t = c - a - b;
        long t1 = t * t;
        long t2 = 4 * a * b;
        if(t1 > t2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}