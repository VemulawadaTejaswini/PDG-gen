import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a == b) {
      System.out.println(1 + " " + 2 * a);
      for(int i = 0; i < 2 * a; i++) {
        if(i % 2 == 0) {
          System.out.print(".");   
        } else {
          System.out.print("#"); 
        }
      }
      System.out.println();
    } else if(a > b) {
      int x = a - b;
      System.out.println(3 * x + " " + (4 + 2 * (b - 1)));
      for(int i = 0; i < 3 * x; i++) {
        for(int j = 0; j < (4 + 2 * (b - 1)); j++) {
          if(j < 4) {
            if(j == 0) {
              System.out.print(".");
            } else if((j == 1) || (j == 3)) {
              System.out.print("#");
            } else {
              if(j % 3 == 1) {
                System.out.print(".");
              } else {
                System.out.print("#");
              }
            }
          } else {
            if(j % 2 == 0) {
              System.out.print(".");
            } else {
              System.out.print("#");
            }
          }
        }
        System.out.println();
      }
    } else {
      int x = b - a;
      System.out.println(3 * x + " " + (4 + 2 * (a - 1)));
      for(int i = 0; i < 3 * x; i++) {
        for(int j = 0; j < (4 + 2 * (a - 1)); j++) {
          if(j < 4) {
            if(j == 0) {
              System.out.print("#");
            } else if((j == 1) || (j == 3)) {
              System.out.print(".");
            } else {
              if(j % 3 == 1) {
                System.out.print("#");
              } else {
                System.out.print(".");
              }
            }
          } else {
            if(j % 2 == 0) {
              System.out.print("#");
            } else {
              System.out.print(".");
            }
          }
        }
        System.out.println();
      }     
    }
  }
}