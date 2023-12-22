import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner I = new Scanner(System.in);
    int a =I.nextInt();
    int b =I.nextInt();
    int c=1; int d=1;
    if(a>=b){
      for(int i=0;i<a;i++){
         c = 10*c;}
      int e = (c-1)*b/9;
      System.out.println(e);}
    else{
      for(int i=0;i<b;i++){
         d = 10*d;}
      int f = (d-1)*a/9;
      System.out.println(f);}
  }
}
      