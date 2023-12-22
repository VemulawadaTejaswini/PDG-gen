
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long h=in.nextLong();

        long pow=(long)(Math.log(h) / Math.log(2));
        long num= (long)(Math.pow(2,(pow+1)))-1;
        System.out.println(num);

    }
}
