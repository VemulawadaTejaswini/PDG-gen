import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int x = in.nextInt();
        int right = Math.min(1000000,x+k-1);
        for(int i=Math.max(-1000000,x-k+1); i<right; i++) {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println(right);
    }
}
