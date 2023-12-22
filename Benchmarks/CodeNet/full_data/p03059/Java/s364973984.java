import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        if(A > T){
            System.out.println(0);
        }else{
            int result = T / A * B;
            System.out.println(result);
        }
    }
}
