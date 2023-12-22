import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if(X >= Y){
            System.out.println("War");
            return;
        }
        int a = -100;
        int b = 100;
        for(int i = 0;i < N;i++)    a = Math.max(a, sc.nextInt());
        for(int i = 0;i < M;i++)    b = Math.min(b, sc.nextInt());
        if(a < b)   System.out.println("No War");
        else    System.out.println("War");
    }
}