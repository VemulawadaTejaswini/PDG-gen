import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] dance = sc.next().toCharArray();
    boolean bl = true;
    for(int i = 0; i < dance.length; i++){
      if(i % 2 == 0){
        if(dance[i] == 'L'){
          bl = false;
          break;
        }
      }else{
        if(dance[i] == 'R'){
          bl = false;
          break;
        }
      }
    }
    if(bl){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}