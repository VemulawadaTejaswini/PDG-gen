import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int total = 0;
    if(a<b){
      for(int i=1 ; i<b ; i++){
        int c = (int)Math.pow(10,i);
        total = total + c*a;
      }
      total = total + a;
    }else{
      for(int i=1 ; i<a ; i++){
        int c = (int)Math.pow(10,i);
        total = total + c*b;
      }
      total = total + b;
    }
    System.out.println(total);
  }
}
