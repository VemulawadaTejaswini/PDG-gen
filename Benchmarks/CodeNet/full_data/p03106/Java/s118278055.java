import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=0;
    int k=sc.nextInt();
    int[] x=new int[k];
    for(int i=0;i<100;i++){
      if(a%i==0 && b%i==0){
        x[c]=i;
        c++;
        if(c==k){
          break;
        }
      }
    }
    System.out.println(x[k-1]);
  }
}