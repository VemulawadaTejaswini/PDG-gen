import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans;
        if (num1 + num2 > num1 * num2){
            ans = num1 + num2;
        }else{
            ans = num1 * num2;
        }
        System.out.println(ans);

        
    }
}
