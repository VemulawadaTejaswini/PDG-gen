import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int a = 0;
    int b = 0;

    int[] l = new int[n];
    for (int i=0; i<l.length; i++){
      l[i] = sc.nextInt();
    }
    for (int j=0; j<k; j++){
      for (int i=j; i<l.length; i++){
        if (l[j] < l[i]){
          b = l[j];
          l[j] = l[i];
          l[i] = b;
        }
      }
    }
    for (int i=0; i<k; i++){
      a += l[i];
      System.out.println(l[i]);
    }
    System.out.println(a);
  }
}