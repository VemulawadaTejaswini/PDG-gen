import java.util.*;
public class Main{
  public static void main(String[] args){
    try{
      Scanner scanner = new Scanner(System.in);
      boolean flag = true;
      int i=0;
      int[] num={0,1,0,0,1,0,0,1,0,1};
      for(i=0;i<4;i++){
        int N = scanner.nextInt();
        num[N]--;
        if(num[N]!=0){
          flag = false;
        }
      }
      if(flag){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
      scanner.close();
    }catch(Exception e){
      System.out.println("何か入力してください");
    }
  }
}
