import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = sc.next();
    int counterA = 0;
    int counterB = 0;
    int total = 0;
    for(int i=0; i<n; i++) {
      switch(s.substring(i, i+1)){
        case "a":
          counterA++;
          if(total<a+b) {
            System.out.println("Yes");
          } else {
            System.out.println("No");
          }
          total++;
          break;
        case "b":
          counterB++;
          if(total<a+b && counterB<=b){
            System.out.println("Yes");
          } else {
            System.out.println("No");
          }
          total++;
          break;
        default:
          System.out.println("No");
          break;
      }
    }
  }
}