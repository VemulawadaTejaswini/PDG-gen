import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        int iti = yomi.nextInt();
        int ni = yomi.nextInt();
        int san = yomi.nextInt();
        if (iti+ni+san <= 21){
            System.out.println("win");
        }else System.out.println("bust");

    }
}
