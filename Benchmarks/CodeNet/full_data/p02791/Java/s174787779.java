import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] p = new int[n];
    int count = 0;
  for (int i = 0; i < n; i++){
    p[i] = Integer.parseInt(sc.next());
  }
  int arrayMin = 2*(10^5)+1;
  for (int i = 0; i < n; i++){
    arrayMin = Math.min(arrayMin,p[i]);
    if(arrayMin == p[i]){
      count++;
    }
  }
  System.out.println(count);
  }
}
