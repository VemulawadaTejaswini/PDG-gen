import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    ////1112222 -> 2221111
    int count = 0;
    int countb = 0;
    char a = 'a';
    char b = 'a';
    int flag = 0;
    char[] Split = S.toCharArray();
    char[] Tplit = T.toCharArray();
    while(a != 'A'){
      for(int i = 0;i < S.length();i++){
        if(a == Split[i]){
        count++;
        break;
        }
      }
      a++;
    }
    while(b != 'A'){
      for(int i = 0;i < T.length();i++){
        if(b == Tplit[i]){
        countb++;
        break;
        }
      }
      b++;
    }
  if(count == countb){
    System.out.println("Yes");
  }else{
    System.out.println("No");
  }
  }
}
