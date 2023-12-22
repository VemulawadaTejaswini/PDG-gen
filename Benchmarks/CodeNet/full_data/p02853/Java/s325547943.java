import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int prize = 0;
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        prize += calcPrize(x);
        prize += calcPrize(y);
        if (x == 1 && y == 1) {
            prize += 400000;
        }
        
        System.out.println(prize);
    }
    
    static int calcPrize(int x) {
        switch (x) {
            case 1: return 300000;
            case 2: return 200000;
            case 3: return 100000;
            default: return 0;
        }
    }
}
