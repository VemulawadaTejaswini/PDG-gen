import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 宣言
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int xmax = -1000;
        int ymin = 1000;
        int com;
        
        //xmaxの検索  
        for(int i = 0; i < N; i++){
            com = sc.nextInt();
            if(xmax < com){
                xmax = com;
            }
        }
        
        // yminの検索
        for(int i = 0; i < M; i++){
            com = sc.nextInt();
            if(ymin > com){
                ymin = com;
            }
        }
        
        // 条件判定と出力
        if((xmax < ymin) && (X < ymin) && (xmax < Y)){
            System.out.println("No War");
        }else{
            System.out.println("War");
        }
    }
}
