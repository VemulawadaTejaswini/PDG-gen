import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[2];
    a[0] = sc.nextInt();
    a[1] = sc.nextInt();
    for(int i = 1;i<=3;i++){
      int count = 0;
      for(int j = 0;j<2;j++){
        if(i != a[j]){
          count++;
        }
      }
      if(count == 2){
        System.out.println(i);
      }
    }

  }
}
