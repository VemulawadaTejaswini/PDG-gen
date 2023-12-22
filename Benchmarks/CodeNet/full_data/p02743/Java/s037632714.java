import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        long z = in.nextLong();
        if((Math.sqrt(x) +Math.sqrt(y))<Math.sqrt(z)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}