import java.util.*;

public class Main{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int P;
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for(int i=0;i<N;i++){
            P = sc.nextInt();
            if(P <= A) cnt1++;
            else if(A+1 <= P && P <= B) cnt2++;
            else if(B+1 <= P) cnt3++;
        }

        System.out.println(Math.min(cnt1, Math.min(cnt2,cnt3)));
    }
}