import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] v = new int[n];
    int[] c = new int[n];
    int[] sub = new int[n];
    int num = 0;
    for(int i=0; i<n;i++){
      v[i] = sc.nextInt();
    }
    for(int i=0; i<n;i++){
      c[i] = sc.nextInt();
    }
    for(int i=0; i<n;i++){
      sub[i] = v[i] -c[i];
    }
    for(int i=0; i<n;i++){
      if(sub[i]>0){
        num += sub[i];
      }
    }
    System.out.println(num);
  }
}