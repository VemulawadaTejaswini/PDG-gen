import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int count = 0;
    for(int i = 1;i <= b;i++){
      if(i%a == 0){
        if(count < c){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
