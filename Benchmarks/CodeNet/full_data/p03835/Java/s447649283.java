import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int s = sc.nextInt();
    int point = 0;
    for(int i = 0;i <= k;i++){
      for(int j = 0;j <= k;j++){
        for(int t = 0;t <= k;t++){
          if(i+j+t == s){
            point++;
          }
        }
      }
    }
    System.out.println(point);
  }
}
