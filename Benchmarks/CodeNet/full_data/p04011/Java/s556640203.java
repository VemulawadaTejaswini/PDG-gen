import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(n<=k){
            System.out.println(n*x);
        }
        else if(n>k){
            System.out.println(k*x + (n-k)*y);
        }
    }
}