import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = next();
    String b = next();
    String x = "";
    if((int)a >= (int)b){
      for(int i = 0; i < (int)a; i++){
        x += b;
      }
      System.out.println(x);
    }else{
        for(int i = 0; i<(int)b; i++){
          x += a;
        }
      System.out.println(x);
      }
      
    }
  }
