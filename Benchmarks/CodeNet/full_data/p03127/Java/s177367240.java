import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    for(int i=0; i<n; i++){
      array[i] = sc.nextInt();
    }
    
    int m = array[0];
    for(int i=1; i<array.length; i++){
      int n = array[i];
      if(n > m){
        int l = m;
        m = n;
        n = l;
      }
      while(true){
        int r = m%n;
        if(r == 0){
          m = r;
          break;
        }
        m = n;
        n = r;
      }
    }
    System.out.print(m);
  }
}