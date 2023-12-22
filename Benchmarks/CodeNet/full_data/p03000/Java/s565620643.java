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
        int i = 0; //座標用
        int j = 0; //跳ねた回数カウント用
        int a = 0; //配列を回す用
        while(i <= X){
            i = i + L[a];
            j++;
            a++;
        }
        System.out.println(j);
    }
}