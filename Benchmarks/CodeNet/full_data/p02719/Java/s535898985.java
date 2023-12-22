import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int a = N%K;
        int b = (N+K)%K;
        if(a < b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
} 