import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int explosion = scan.nextInt();
        explosion%=5;
        System.out.print("Christmas");
        for(int i=5;i>explosion;i--){
            System.out.print(" Eve");
        }
        System.out.println("");
    }
}
