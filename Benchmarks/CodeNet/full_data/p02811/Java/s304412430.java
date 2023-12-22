import java.util.*;
import java.lang.*;

class Main {
    public static void main (String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int numberOfCoins = scanner.nextInt();
        int total = scanner.nextInt();
        if((numberOfCoins*500)>=total){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    }
}

