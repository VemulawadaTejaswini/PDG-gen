import java.util.Scanner;

public class kuku{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);

    int a=stdIn.nextInt();
    int b=stdIn.nextInt();
    if(0<a && a<10 && 0<b && b<10){
      System.out.println(a*b);
    }else{
      System.out.println(-1);
    }
  }
}
