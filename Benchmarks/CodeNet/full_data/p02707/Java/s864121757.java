import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    int a,b,d;
    a = 0;
    d = sc.nextInt();
    int e = 0, f = 0;
    int x[] = new int[c];
    for(b = 0;b < c;b++){
      x[b] = 0;
    }
    int g = 0;
    if(d > a){
        e  = d;
        f++;
      }
    for(b = 0;b < c-2;b++){
      d = sc.nextInt();
      if(d > e){
        e  = d;
        x[g] = f;
        //System.out.println(x[g]);
        g++;
        f = 1;
      }
      else{
        f++;
      }
    }
    x[g] = f;
    for(b= 0; b < c;b++){
      System.out.println(x[b]);
    }
  }
}