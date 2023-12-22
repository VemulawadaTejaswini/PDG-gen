import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    if(str.charAt(2)==str.charAt(3)&&str.charAt(4)==str.charAt(5)){
      pl("Yes");
    }else{
      pl("No");
    }
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
