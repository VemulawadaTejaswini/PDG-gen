import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //数
        //int[]b = new int[a]; //リンゴの味入れる配列
        int c = sc.nextInt(); //味初期値
        // int[] data = Taste(c, a, b);
        int[] data = Taste(c, a);
    
        //0に近いもの＝食べるものを決める
        int ans = Ans(data, a);
        System.out.println(ans);
 
    }
 
    // private static int[] Taste(int c,int a, int b[]){
    private static int[] Taste(int c,int a){
        int[]b = new int[a]; //リンゴの味入れる配列
        for(int i = 0; i < a; i++){
            //味入れていく
            b[i] = c + i;
        }
        return b;
    }
 
    //食べるもの決めたらその値0にしてすべて合算して返す
    private static int Ans(int data[], int a){
        //絶対値をとる（負の値対策）
        for(int i = 0; i < a; i++){
            data[i] = Math.abs(data[i]);
        }
        Arrays.sort(data);
        data[0] = 0;
        int ans = 0;
        for(int i = 0; i < a; i++){
            ans = ans + data[i];
        }
        return ans;
    }
}