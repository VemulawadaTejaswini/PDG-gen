import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int S = N*(N-1)/2+M*(M-1)/2;
        System.out.print(S);
    }
 
}