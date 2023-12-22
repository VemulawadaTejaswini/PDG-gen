import java.util.*;

public class Main{
    static int N;
    static int A;
    static int B;
    static int C;
    static int[] l;
    static int MP;
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        l = new int[N];
        for(int i = 0; i < N; i++){
            l[i] = sc.nextInt();
        }
        sc.close();
        MP = 1000000000;
        dps(0, 0, 0, 0, 0);
        System.out.println(MP);
    }

    static void dps(int cur, int a, int b, int c, int count){
        if(cur == N){
            if((Math.abs(A-a) + Math.abs(B-b) + Math.abs(C-c) - 30 + 10*count) < MP &&
                (a>0&&b>0&&c>0)){
                    MP = Math.abs(A-a) + Math.abs(B-b) + Math.abs(C-c) - 30 + 10*count;
                }
        } else if(cur < N) {
            dps(cur+1, a, b, c, count);
            dps(cur+1, a+l[cur], b, c, count+1);
            dps(cur+1, a, b+l[cur], c, count+1);
            dps(cur+1, a, b, c+l[cur], count+1);
        }
    }
}
