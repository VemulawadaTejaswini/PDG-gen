import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] num = new int[5];
    int t = 0;//入れ替え用
    int sum = 0;
    for(int i=0; i <= 4; i++){
    num[i] = sc.nextInt();
    if(i!=0){
        if((num[i]%10)!=0){
         if((num[i-1]%10) < (num[i]%10)){
            t = num[i-1];
            num[i-1] = num[i];
            num[i] = t;
         }
        }else if((num[i]%10 == 0)){
            if((num[i-1]%10) > (num[i]%10)){
            t = num[i-1];
            num[i-1] = num[i];
            num[i] = t;
         }
        }
    }
  }

    for(int i=0; i <= 3; i++){
        if((num[i] % 10) == 0){
        sum += num[i];
        //System.out.println(num[i]);
    }else if((num[i] % 10) != 0){
        sum = sum + num[i] + (10 - num[i]%10);
        //System.out.println(num[i]);
    }
    }
        sum = sum + num[4];
        System.out.println(sum);
  }
}