import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();
    int count=0;
    for(int i=0,max=1,p;i<n;i++){
      p = sc.nextInt();
      if(p=>max){
        count++;
        max=p;
      }
    }
    System.out.println(count);
  }
}