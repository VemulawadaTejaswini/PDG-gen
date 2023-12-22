import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int j = 2;
    int k = 0; // カウントする数
    while((n/j)%2 !=1){
      if(n%j == 0){
        j = j* 2;
        k = k+1;
      }else{
        break;
      }
    }
    System.out.println(j);
  }
}
