import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String C = sc.next();
        
        String[] eng = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','x','y'}; 
        
        for(i = 0; i < 25; i++){
            if(C.equals(eng[i])){
                System.out.println(eng[i+1]);
                break;
            }
        }

        // 出力
        
    }
}