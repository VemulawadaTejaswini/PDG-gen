import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        if(Math.sqrt((double)a) + Math.sqrt((double)b) < Math.sqrt((double)c)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}