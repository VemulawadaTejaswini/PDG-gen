import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int tmp = 1;
        for (int i = 0; i < n; i++){
            int a = input.nextInt();
            if (a%2 == 0){
                tmp *= 2;
            }
        }
        int ans = (int)Math.pow(3,n) - tmp;
        System.out.println(ans);
    }
}