import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    char[] tap = sc.next().toCharArray();

    // 踏みにくい
    char gu = 'R';
    char ki = 'L';
    for(int i = 0; i < tap.length;i++){
      if((i + 1) % 2 == 0){
        if(tap[i] == gu){
          System.out.println("No");
          return;
        }
      } else {
        if(tap[i] == ki){
          System.out.println("No");
          return;
        }
      }
    }
    System.out.println("Yes");
  }
}
