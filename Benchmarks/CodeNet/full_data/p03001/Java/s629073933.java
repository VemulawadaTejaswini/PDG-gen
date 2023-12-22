import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt(); 
    double h = 0;
    double v = 0;
    if(a - c < c){
      v = (double)((a - c) * b);
    }else{
      v = (double)(c * b);
    }
    if(b - d < d){
      h = (double)((b - d) * a);
    }else{
      h = (double)(d * a);
    }       
    if(v < h){
      System.out.println(h); 
      System.out.println(0);      
    }else if(v == h){
      System.out.println(h);
      System.out.println(1);
    }else{
      System.out.println(v);
      System.out.println(0);      
    }
  }
}