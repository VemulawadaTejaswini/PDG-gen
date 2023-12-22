import java.util.Scanner;
public class Main{
public static void main(String[] args){
  String[] s = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
  Scanner sc = new Scanner(System.in);
  String str = sc.next();
  String str1 = "SUN";
  int i = 0;
  if(str.equals(str1)){
    i = 7;
  }else{
  while(!(str.equals(s[i]))){
    i = i + 1;
    }
  System.out.print(i);
  }
  }