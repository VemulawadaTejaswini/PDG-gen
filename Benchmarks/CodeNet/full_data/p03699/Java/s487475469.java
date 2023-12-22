import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] s = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++){
            s[i] = sc.nextInt();
            sum+=s[i];
        }

        Arrays.sort(s);

        if(sum % 10 != 0) {
            System.out.println(sum);
            return;
        }

        for(int i = 0; i < n; i++){
            sum-=s[i];

            if(sum % 10 != 0){
                System.out.println(sum);
                return;
            }
        }
        System.out.println(0);
    }
}
