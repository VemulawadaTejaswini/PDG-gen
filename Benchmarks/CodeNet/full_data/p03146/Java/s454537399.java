import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner( System.in );
        int x = sc.nextInt();
      
        while(x != 1){
            if(x & 1 == 0){	//偶数の場合
                x /= 2;
            }else{			//奇数の場合
                x * 3 + 1;
            }
        }
        System.out.println(x + 1);
    }
}