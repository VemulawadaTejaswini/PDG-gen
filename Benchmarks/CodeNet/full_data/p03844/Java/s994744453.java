import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x,y;
    String str;
    x = sc.nextInt();
    str = sc.nextString();
    y = sc.nextInt();
    if(str == "+"){
      System.out.println(x+y);
    }
    else{
      System.out.println(x-y);
    }
  }
}
