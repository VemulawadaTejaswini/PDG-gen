import java.util.Scanner;
public class Main{
public static void main(String[] args){
  String[] s = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
  Scanner sc = new Scanner(System.in);
  String str = sc.next();
  int i = 0;
  while(!(str.equals(s[i + 1]))){
    i = i + 1;
    }
  System.out.print(i);
  }
  }