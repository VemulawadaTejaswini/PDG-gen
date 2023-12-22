import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      int a, b, c, k;

      a=Integer.parseInt(sc.next());
      b=Integer.parseInt(sc.next());
      c=Integer.parseInt(sc.next());
      k=Integer.parseInt(sc.next());

      if(a<=c && b<=c){
        for(int i=0; i<k; i++){
          c=c*2;
        }
        System.out.println(a+b+c);
      }
      if(a<=b && c<=b){
        for(int i=0; i<k; i++){
          b=b*2;
        }
        System.out.println(a+b+c);
      }
      if(b<=a && c<=a){
        for(int i=0; i<k; i++){
          a=a*2;
        }
        System.out.println(a+b+c);
      }

    }
    catch (Exception e) {

    }
  }
}
