import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();

    if(x == 2 || y == 2){
        System.out.println("No");
    }else{
        if(x == 4 || x == 6 || x == 9 || x == 11){
            x=4;
        }else{
            x=1;
        }
        if(y == 4 || y == 6 || y == 9 || y == 11){
            y=4;
        }else{
            y=1;
        }
        if(x==y){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
  }
}