import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean[] a = new boolean[n+1];
    for(int i = 1; i < n + 1; i++){
      a[i] = (i == sc.nextInt());
    }
    long count = 0;
    for(int i = 1; i < n + 1; i++){
      if(!a[i]){
        continue;
      }else if(a[i+1]){
        count++;
        i++;
      }else{
        count++;
      }
    }
    System.out.println(count);
  }
}