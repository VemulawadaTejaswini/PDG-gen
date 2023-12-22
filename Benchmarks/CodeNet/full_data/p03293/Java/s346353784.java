import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
String S = sc.next();
String T = sc.next();
  String S2=S+S;
if(S2.contains(T)){
  System.out.println("Yes");
}else{
  System.out.println("No");
}
}
}
