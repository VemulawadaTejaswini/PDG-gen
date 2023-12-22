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
    Arrays.sort(ary);
    int a = n/2;
    int b = 0;
    if(ary[a]!=ary[a-1]){
      b = ary[a-1];
      count = ary[a] - b;
    } 
    System.out.println(count);
  } 
}