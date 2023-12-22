import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int[] ary = new int[n];
    for(int c = 0;c<n;c++){
      ary[c] = sc.nextInt();
    }
    for(int c = 1;c<n-1;c++){
      if(ary[c]>ary[c-1]&&ary[c+1]>ary[c]){
        count++;
      }else if(ary[c+1]<ary[c]&&ary[c]<ary[c-1]){
        count++;
      }
    }
    System.out.println(count);
  } 
}