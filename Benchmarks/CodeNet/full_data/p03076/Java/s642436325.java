import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int num[] = new int[5];

    for(int i=0; i<=4; i++){
      num[i] = scanner.nextInt();
    }

    //％１０が0の時だけ足せるように++していく処理
    //一の位が１以上でもっとも小さいものを最後に処理する
    for(int i=0; i<=4; i++){
      int temp;
      if(num[i] % 10 == 0){
        if(i!=0) {
          temp = num[i-1];
          num[i-1] = num[i];
          num[i] = num[i-1];
          continue;
        }
      }
      if(i!=4){
        if(num[i]%10 < num[i+1]%10){
          temp = num[i];
          num[i] = num[i+1];
          num[i+1] = temp;
        }
      }
    }
    int sum = 0;
    int n = 0;
    
    while(true){

      if(sum % 10 == 0){
        sum += num[n];
        n++;

      }else{
        sum++;

      }

      if(n==5){
        System.out.println(sum);
        return;
      }
    }
  }
}