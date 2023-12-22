import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
      //時間の取得
	  int[] T = new int[5];
      for(int i=0;i<5;i++){
        T[i] = sc.nextInt();
      }
      //総時間
      int sum = 0;
      for(int j=0;j<10;j++){
         for(int i=0;i<5;i++){
          //あまり時間が少ないものから注文
             if(T[i]%10==j){
               sum=sum+T[i]+i;
             }
          //最後に注文した商品のあまり時間を引く
               sum=sum-i;
          }
      }
        System.out.println(sum);
    }
}