import java.util.Scanner;
public class Main {
    static int[] H;
    static int result = 0;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        H = new int[N];
        for(int i = 0; i < N; i++){
            H[i] = scan.nextInt();
        }
        int i = 0;
        while(i < N - 1){
            i = constH(i, N);
        }
        System.out.println(result);
        scan.close();
        
    }
    // I番目から右隣へ移動した場合の移動量を返す
    // 戻り値は次に調べる位置
    public static int constH(int I, int N){
        int i = 0;
        int temp = 0;
        for(i = I; i < N - 1; i++){
            if(H[i+1] <= H[i]){
                temp++;
            }else{
                break;
            }
        }
        if(result < temp){
            result = temp;
        }
        return i + 1;
    }
    
}
