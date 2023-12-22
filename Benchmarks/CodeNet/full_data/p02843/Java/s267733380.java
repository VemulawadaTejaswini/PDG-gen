import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int divideX = (int) (X / 100);

        if(X > 2000) {
            System.out.println(1);
        } else if(divideX * 100 <= X && X <= divideX * 105){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

