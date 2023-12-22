import java.util.*;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int cnt1 = 0;
        int cnt2 = sc.nextInt();
        // 値取得
        while(sc.hasNext()){
          nums.add(sc.nextInt());
        }

      //　判定 
      for(int i = 0; i < cnt2; i++ ){
        
        int res = 0;
        int now = nums.get(i);

        //　両隣の排他的論理和を計算する
        if(i == (cnt2 -1)){
          res = nums.get(i - 1) ^ nums.get(1);
        }else if(i == 0){
          res = nums.get(0) ^ nums.get(i + 1);        
        }else{
          res = nums.get(i - 1) ^ nums.get(i + 1);                
        }
    //System.out.println(res);
        if (res != now){
          cnt1++;          
        }        
        
      }
      // ビットごとの排他的論理和が等しい場合
      if(cnt1 == 0){
        System.out.println("Yes");
      }else{
        // 上記以外の場合
        System.out.println("No");      
      }
    }
}
