import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        long num = scan.nextLong();
        long a = scan.nextLong();
        long b = scan.nextLong();

        // answer
        if(num == 1 && a != b){
            System.out.println(0);
        } else if (a > b){
            System.out.println(0);
        } else {
            System.out.println((b - a) * (num - 2) + 1);
        }
        

    }
}