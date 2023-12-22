import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int a = N%K;
        if(a < K - a){
            System.out.println(a);
        }else{
            System.out.println(K-a);
        }
    }
} 