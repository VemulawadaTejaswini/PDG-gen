import java.util.*;
public class Main{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  String str = sc.next();
  if(n%2=1){
    System.out.println("No");
    System.exit(0);
  }else{}
  String str1 = str.substring(1,n/2);
  String str2 = str.substring((n/2)+1,n);
  if(str1.equals(str2)){
    System.out.println("Yes");
  }else{
    System.out.println("No");
  }


}
}