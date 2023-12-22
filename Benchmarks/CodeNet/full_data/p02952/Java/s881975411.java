import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        int n = yomi.nextInt();
        if (n<10){
            System.out.println(n);
        }else if (n<100){
            System.out.println(9);
        }else if (n<1000){
            System.out.println(n+9);
        }else if (n<10000){
            System.out.println(9+999);
        }
    }
}