import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = n;
        int sum = 0;
        while(n2 >= 1){
            sum = sum + n2%10;
            n2 = n2 / 10;
        }
        if(n%sum == 0){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
