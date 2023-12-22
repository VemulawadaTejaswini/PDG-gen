import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;

        if(13 <= A)    ans = B;
        else if(6 <= A && A < 13)    ans = B / 2;
        else    ans = 0;

        System.out.print(ans);
    }
}