import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String blank = sc.nextLine();
    String s[] = new String[h];

    for(int i = 0; i < h; i++){s[i] = sc.nextLine();}
    for(int i = 0; i < h; i++){
      for(int j = 0; j < 2; j++){
        System.out.println(s[i]);
      }
    }

  }
}