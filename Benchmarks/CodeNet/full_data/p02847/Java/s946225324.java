import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String temp = sc.next();
    String[] str = {"SAT","FRI","THU","WED","TUE","MON","SUN"};
    for(int i=0;i<7;i++){
      if(str[i].equals(temp)) System.out.println(i+1);
    }
  }
}
