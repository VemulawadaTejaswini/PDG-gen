import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            if((int)Math.floor(i * 1.08) == n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(":(");
    }
}
