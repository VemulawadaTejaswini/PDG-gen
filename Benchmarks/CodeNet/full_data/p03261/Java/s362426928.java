import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 宣言・値の格納
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] W = new String[N];
        char wLast;
        char wFirst;
        
        W[0] = sc.next();
        
        // 頭と末尾の一致判定
        for(int i = 0; i < N-1; i++){
            W[i+1] = sc.next();
            wFirst = W[i].charAt(W[i].length()-1);
            wLast = W[i+1].charAt(0);
            
                // 一致しない場合
                if(!(wFirst == wLast)){
                    System.out.println("No");
                    return;
                }
        }
        
        // 新規の単語かの判定
        for(int i = 0; i < N; i++){
            for(int j = 0; j < i; j++){
                
                //新規でない場合 
                if(W[i].equals(W[j])){
                    System.out.println("No");
                    return;
                }
            }
        }

        // 規則を順守している場合
        System.out.println("Yes");

    }
}
