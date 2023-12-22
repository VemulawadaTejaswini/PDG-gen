import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int len = sc.nextInt();
       int []array = new int[len];
       int A = sc.nextInt();
       int B = sc.nextInt();
       int A_flag = 0;
       int B_flag = 0;
       if((B-A-1)%2 == 1){
           System.out.println("Alice");
       }else if((B-A-1)%2 == 0){
           System.out.println("Borys");
       }
       
    }
}
