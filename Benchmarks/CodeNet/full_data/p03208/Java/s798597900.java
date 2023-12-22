import java.util.*;

class Main{
    static{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        // int ans = 0;
        // int notAns = 0;
        // //大きい木と小さい木を差し引く
        // //iは初期値0なので最初はKと0の比較
        // for(int i = 0; i < (K - 1); i++){
        //     ans = a[K - 1 + i] - a[0 + i];
        //     //前のans比較して小さければ更新したい
        //     if(ans < notAns){
        //         notAns = ans;
        //     }
        //     notAns = notAns;
        // }

        int[]ans = new int[K ];
        for(int i = 0; i < (K - 1); i++){
            ans[i] = a[K - 1 + i] - a[0 + i];
        }
        Arrays.sort(ans);
        System.out.println(ans[0]);
    }
    public static void main(String[] args){

    }
}