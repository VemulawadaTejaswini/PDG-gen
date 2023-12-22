import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        String a = "No";
        
        if(N==M){
            a = "Yes";
        }
        System.out.println(a);
    }
}
