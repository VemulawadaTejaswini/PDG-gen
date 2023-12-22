import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int range = 2*d+1;
        System.out.println((n+range-1)/range);
        System.out.flush();
        sc.close();
    }

}