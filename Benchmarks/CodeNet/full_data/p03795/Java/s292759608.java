import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        int x = N * 800;
        int y = (N / 15) * 200;
        System.out.println(x - y);
    }
}
