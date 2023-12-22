import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int count = 1;
    HashSet<Integer> array = new HashSet<Integer>();
    for(int b=0;b<n;b++){
      a[b]=sc.nextInt();
    }
    int c = a[0];
    while(a[c-1]!=2){
      c = a[c-1];
      count += 1;
      if(array.contains(c)){
        System.out.println(-1);
        break;
      }else{
        array.add(c);
      }
    }
    if(a[c-1]==2){
      count += 1;
      System.out.println(count);
    }
  }
}