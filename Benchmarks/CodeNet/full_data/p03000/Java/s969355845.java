import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[]L = new int[N];
        //跳ねる回数はN+1(1回目は0なのでLの入力自体はN個分のみ)
        for(int i = 0; i < N; i++){
            L[i] = sc.nextInt();
        }
        sc.close();
        int i = 0; //座標用
        int j = 1; //跳ねた回数カウント用,1回目の0はwhile内で処理しないので初期値1
        int a = 0; //配列を回す用
        //j + 1, N + 1で打ち消しあっているので省略
        while(i <= X && j <= N){
            i = i + L[a];
            j++;
            a++;
        }
        j--; //上のwhileだと一回余計に回る
        System.out.println(j);
    }
}