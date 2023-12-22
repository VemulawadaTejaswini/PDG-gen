import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        int A = sn.nextInt();
        int B = sn.nextInt();
        int cnt = 0;

        if(A % 2 == B % 2){
            cnt = (B-A)/2;
        }else{
            cnt = Math.min(A-1, N-B) + 1 + (B-A-1)/2;
        }

        System.out.println(cnt);
    }
}