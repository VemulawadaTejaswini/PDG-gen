import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    int a,b,d;
    
    int x[] = new int [c];
    int y[] = new int [c];
    for(b =1;b < c;b++){
      x[b] = sc.nextInt();
    }
    x[0] = 0;
    int f = 1;
    int g = 1;
    for(b =0;b < c;b++){
      d = 0;
      f = g;
      int h = x[b]+1;
      for(a = f; a< c;a++){
        if(x[a] == h){
          d++;
          g++;
        }
      }
      y[b] = d;
    }
      
      
      
    for(b =0;b < c;b++){
      System.out.println(y[b]);
    }
  }
}