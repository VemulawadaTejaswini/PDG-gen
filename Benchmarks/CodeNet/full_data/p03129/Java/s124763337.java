import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int jud = n/2+1;
        String ans = "No";
        if(k <= jud){
            ans = "Yes";
        }
        System.out.println(ans);
    }
}
