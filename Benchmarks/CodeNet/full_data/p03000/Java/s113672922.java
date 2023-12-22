import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] l = new int[n];
    for(int i = 0;i<n;i++){
      l[i] = sc.nextInt();
    }
    int count = 0;
    int now = 0;
    for(int i = 0;i<n;i++){
      if(now>x)break;
      count++;
      now+=l[i];
    }
    System.out.println(count);
  }
}
