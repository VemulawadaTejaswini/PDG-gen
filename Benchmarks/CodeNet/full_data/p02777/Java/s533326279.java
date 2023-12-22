import java.util.*;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        final int n = sc.nextInt();
        int number[] = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        Arrays.sort(number);
        for (int i = 0; i < n - 1; i++) {
            if(number[i] == number[i + 1]){
                System.out.println("NO");
                sc.close();
                return;
            }

        }
        System.out.println("YES");
        sc.close();
    }
}