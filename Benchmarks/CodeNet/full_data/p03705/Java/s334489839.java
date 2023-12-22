import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(n == 1 && a != b || a > b){
            System.out.println(0);
        }else if(a == b || n == 2 && a != b){
            System.out.println(1);
        }else{
            System.out.println((n-2)*(b+1)-(n-2)*(a+1));
        }
    }
}
