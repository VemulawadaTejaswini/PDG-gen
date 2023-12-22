import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();

        if(h%2==1&&w%2==1) {
            System.out.println(h*w/2+1);
        } else {
            System.out.println(h*w/2);
        }
    }
}
