import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if((a >= 1 && a <=9) && (b >= 1 && b <=9)){
            for (int i = 0; i < Math.max(a,b); i++){
                System.out.print(Math.min(a, b));
            }
        }
    }
}