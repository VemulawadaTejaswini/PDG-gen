import java.util.*;

public class Main{
    public static void main(String[] args){
    //入力
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int ans = 0; 
    //処理
        if(R - L >= 2019){
            ans = 0;
        }
        else{
            R = R % 2019;
            L = L % 2019;
            int temp = R*L % 2019;
            for(int i = L;i<=R-1;i++){
                for(int j= i+1;j<=R;j++){
                    temp = Math.min(i*j%2019,temp);
                }
            } 
            ans = temp;
        }
    System.out.println(ans);
        sc.close();

    }
}