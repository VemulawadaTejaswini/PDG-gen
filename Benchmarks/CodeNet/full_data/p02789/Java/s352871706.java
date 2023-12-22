import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = null;
    if(a < b) {
      s = (String) a;
      for(int i= 1; i<b;i++){
        s += (String)a;
      }
    }
    else {
      s = (String) b;
      for(int i= 1; i<a;i++){
        s += (String)b;
      }
    }
    System.out.println(s);
  }
}
