import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    int St = Integer.parseInt(S.substring(0,2));
    int Sb = Integer.parseInt(S.substring(3,4));
    String ans = "";
    if ((St>0)&&(St<=12)){
      if ((Sb>0)&&(Sb<=12)){
        System.out.println("AMBIGUOUS");
      } else {
        System.out.println("MMYY");
      }
    } else {
      if ((Sb>0)&&(Sb<=12)){
        System.out.println("YYMM");
      } else {
        System.out.println("NA");
      }
    }
  }
}