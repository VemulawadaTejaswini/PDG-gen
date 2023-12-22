import java.util.*;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        final int n = sc.nextInt();

        int number[] = new int[n];
        boolean res = false;
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        point:for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if(i != j && number[i] == number[j]){
                    res = true;
                    System.out.println("NO");
                    break point;
                }
            }
        }
        if(!res)
            System.out.println("YES");
        sc.close();
    }
}