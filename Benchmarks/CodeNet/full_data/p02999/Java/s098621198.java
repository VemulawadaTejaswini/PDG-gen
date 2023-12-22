import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int A = sc.nextInt();
        int ans = 0;

        if(X < A)   ans = 0;
        else    ans = 10;

        System.out.print(ans);
    }
}