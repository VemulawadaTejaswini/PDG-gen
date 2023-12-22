import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        // input
        long x = scan.nextLong();
        long y = scan.nextLong();

        // search
        int count = 0;
        while(x <= y){
            x *= 2;
            count++;
        }

        // answer
        System.out.println(count);
    }
}