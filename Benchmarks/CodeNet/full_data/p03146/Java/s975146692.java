import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner( System.in );
        int x = sc.nextInt();
        int count = 0;
        while(x != 1){
            count++;
            if(x % 2 == 0){	//偶数の場合
                x /= 2;
            }else{			//奇数の場合
                x = x * 3 + 1;
            }
        }
        System.out.println(count + 2);
    }
}
