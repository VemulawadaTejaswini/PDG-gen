import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int sum1 = N*A;
        int sum2 = B;
        if(sum1<sum2){
            System.out.println(sum1);
        }else{
            System.out.println(sum2);
        }
    }
}
