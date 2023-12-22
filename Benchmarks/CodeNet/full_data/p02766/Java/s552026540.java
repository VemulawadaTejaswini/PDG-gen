import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int a = 0;
    int count = 0;
    for(int i=0 ; i<n ; i++){
      a = (int)Math.pow(k,i);
      if(n/a>0){
        count++;
      }else{
        count++;
        break;
      }
    }
    System.out.println(count-1);
  }
}
