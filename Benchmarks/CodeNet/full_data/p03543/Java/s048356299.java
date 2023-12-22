import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[4];
    for(int i=3;i>=0;i--){
      a[i] = N %10;
      N = N/10;
    }
    int count = 0;
    for(int i=0;i<3;i++){
      if(a[i] == a[i+1]){
        count++;
      }
    }
    if(count >= 2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
