import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int countL = 0;
    int countR = 0;
    String str = sc.next();
    for(int i = 0; i<n; i++){
      char ch = str.charAt(i);
      if(ch == '('){
        countL++;
      }else{
        if(countL > 0){
          countL--;
        }else{
          countR++;
        }
      }
    }
    for(int i = 0; i<countR; i++){
      System.out.print('(');
    }
    System.out.print(str);
    for(int i = 0; i<countL; i++){
      System.out.print(')');
    }
    System.out.println();
  }
}
