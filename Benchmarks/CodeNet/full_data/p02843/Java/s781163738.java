import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int xx = x%100;
    int sum =0;
    boolean flag = false;
    int[] array = new int[6];
    //System.out.println(xx);
    for(int i=5; i>=1;i--){
      if(xx%i==0){
        flag = true;
        break;
      }


      array[i] = xx/i;
      sum += array[i];
      xx = xx - xx/i * i;
      if(xx%100<sum){
        break;
      }
    }
    if(flag){
      System.out.println("1");
    }else{
      System.out.println("0");
    }



  }
}