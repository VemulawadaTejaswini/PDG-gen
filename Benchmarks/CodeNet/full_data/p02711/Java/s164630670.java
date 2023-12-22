import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    int f = a.nextInt();
    String s = String.valueOf(f);
    for(int i = 0; i < s.length(); i++){
      if(Character.getNumericValue(s.charAt(i)) == 7){
        System.out.println("Yes");
      }else if(i = s.length()-1 && Character.getNumericValue(s.charAt(i)) != 7){
        System.out.println("No");
      }
    }
  }
}