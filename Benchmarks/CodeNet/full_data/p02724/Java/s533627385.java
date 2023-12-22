import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println((x / 500) * 1000 + (x % 500) / 5 * 5);
    }
}