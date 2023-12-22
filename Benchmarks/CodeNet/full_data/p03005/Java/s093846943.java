import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        if (k == 1){
            System.out.println(0);
        } else {
            System.out.println(n - k);
        }
    }
}