import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0;i < n;i++){
            int temp = sc.nextInt();
            while(temp % 2 == 0){
                ans ++;
                temp = temp / 2;
            }
        }

        System.out.println(ans);

    }
}