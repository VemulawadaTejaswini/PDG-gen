import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        int 3digits = x / 100;
        int 2digits = (x / 10) % 10;
        int 1digits = x % 10;
        
        int ans = 3digits + 2digits + 1digits;
        
        if(x % ans == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        System.out.println();
        
        sc.close();
        
    }
}
