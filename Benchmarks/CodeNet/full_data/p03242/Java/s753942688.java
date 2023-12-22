import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int m=0;
        while(n>0){
          if(n%10==1){
            m+=m*10+9;
          }else if(n%10==9){
            m+=m*10+1;
          }else{
             m+=m*10+n%10;
          }
          n/=10;
        }
        // 出力
        System.out.println(m);
    }
}
