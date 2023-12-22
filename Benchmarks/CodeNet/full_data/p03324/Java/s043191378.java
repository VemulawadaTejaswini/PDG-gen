import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int result = 1;
        if(N==0){
            result = M;
        }else if(N==1){
            result = M * 100;
        }else if(N==2){
            result = 100 * M * 100;
        }
        System.out.println(result);
    }
}
