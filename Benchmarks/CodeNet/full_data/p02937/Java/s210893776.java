import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    char[] sChar = s.toCharArray();
    char[] tChar = t.toCharArray();

    int position = 0;
    int count = 0;
    for(int j = 0; j < 10; j++){
      for(int i = 0; i < sChar.length;i++){
        count ++;
        if(tChar[position] == sChar[i]){
          position++;
        }
      }
    }
    System.out.println(count);
  }
}
