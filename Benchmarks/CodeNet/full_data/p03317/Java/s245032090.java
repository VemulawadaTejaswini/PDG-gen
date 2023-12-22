import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if(K==2) System.out.println(N-1);
        else System.out.println(N/(K-1));
    }
}