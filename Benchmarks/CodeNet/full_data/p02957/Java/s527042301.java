import java.util.*;

/*
問題文
N+M個のボールがあります。各ボールには整数が 
1つ書かれています。
これらのボールに書かれている数について、
N個のボールに書かれている数は偶数
M個のボールに書かれている数は奇数
であることがわかっています。

これらの N+M個のボールの中から 2つ選んで、書かれた数の和が偶数になる方法の数を求めてください。選ぶ順序は考慮しません。

なお、この方法の数はボールに書かれている整数の実際の値によらないことが示せます。

制約
0≤N,M≤100
2≤N+M
入力はすべて整数である。
*/



public class Main {
    public static void main(String[] args){

        //スキャン
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        int m = s.nextInt();

        int hoge = (n * (n-1) + m * (m-1))/2;
        
        System.out.println(hoge);
    }

    
}
