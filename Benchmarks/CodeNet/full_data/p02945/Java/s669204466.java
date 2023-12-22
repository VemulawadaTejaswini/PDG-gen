import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      int A =sc.nextInt();
      int B =sc.nextInt();
      
      int m1 =A+B;
      int m2 =A-B;
      int m3 =A*B;
      
      if(m1<m2&&m3<m2){
      System.out.print(m2);
      }
      else if(m2<m3&&m1<m3){
      System.out.print(m3);
      }
      else{
      System.out.print(m1);
      }
    }
}