import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //入力値を設定する
        double numHP = sc.nextInt();
        double numAtk = sc.nextInt();
        
        Integer cnt = 0;
        cnt = (int)Math.ceil(numHP / numAtk);
        
        //出力する
        System.out.println(cnt);
    }    
}