import java.util.*;
public class Main{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  String str = sc.next();
  String str1 = str.subString(0,n/2);
  String str2 = str.subString((n/2)+1,n);
  if(str1.equal(str2)){
    System.out.println("Yes");
  }else{
    System.out.println("No");
  }


}
}