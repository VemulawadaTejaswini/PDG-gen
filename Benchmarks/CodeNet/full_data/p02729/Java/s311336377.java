import java.util.Scanner;

public class Atcoder {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        System.out.println(N*(N-1)/2+M*(M-1)/2);
    }
}
