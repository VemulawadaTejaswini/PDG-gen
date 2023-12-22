import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int c11 = sc.nextInt();
    int c12 = sc.nextInt();
    int c13 = sc.nextInt();
    int c21 = sc.nextInt();
    int c22 = sc.nextInt();
    int c23 = sc.nextInt();
    int c31 = sc.nextInt();
    int c32 = sc.nextInt();
    int c33 = sc.nextInt();

    if(c12 - c11 == c22 - c21 && c22 - c21 == c32 - c31){
        if(c13 - c12 == c23 - c13 && c33 - c32 == c23 - c22){
            System.out.println("Yes");
            return;

        }
    }
    System.out.println("No");

    }    
}
