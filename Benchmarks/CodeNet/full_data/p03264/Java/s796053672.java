import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        if (k % 2 == 1){
            System.out.println(k/2 * (k+1)/2);
        }else {
            System.out.println(k/2 * k/2);
        }
    }
}
