import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        long ans = k * (k/2);
        System.out.println(ans);
    }
}
