import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int l = 0;

        for(int i=2; i<=N+2; i++){
            l += sc.nextInt();
            if(l>X){
                System.out.println(i-1);
                break;
            }
            if(i==N+2){
                System.out.println(N+1);
            }
        }

    }
}