import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for(int i = 1; i < 10; i++){
      for(int o; o < 10; o++){
        if( i * o == N ) {
          System.out.println("Yes");
        }else {
          System.out.println("No");
        }
      }
    }
  }
}
