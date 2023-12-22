import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        boolean flg = true;        
        for(int i = 0; i < N/2; i++){
            if(S.charAt(i) == S.charAt(i + N/2)){
                flg = true;
                continue;
            }else{
                flg = false;
                break;
            }
        }
        if(flg && N != 1 && N%2 != 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}