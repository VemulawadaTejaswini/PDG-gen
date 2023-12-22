import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();

        if(h == 1 || w == 1){
            System.out.println(1);
            System.exit(0);
        }

        System.out.println(Math.round((double)h*w/2));
    }
}