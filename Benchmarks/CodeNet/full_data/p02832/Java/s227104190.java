import java.util.*;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        //ここまで入力
        int ans = 0;
        int check = 1;
        boolean flag = true;

        //数列探索
        for(int i=0; i<N; i++){
            if(A[i] == check) {
                check++;
            } else ans++;
        }
        if(ans == N) flag = false;

        if(flag == true){
            System.out.println(ans);
        }else System.out.println("-1");
    }
}