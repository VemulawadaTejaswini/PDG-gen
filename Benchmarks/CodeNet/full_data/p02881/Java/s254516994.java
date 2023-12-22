import java.util.*;
public class Main{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int N = sc.nextInt();
    int min=N;
    for(int i=1;i*i<=N;i++){
      int x=i;
      int y=N/i-1;
      min=Math.min(min,x+y);
    }
    System.out.println(min);
  }
}
