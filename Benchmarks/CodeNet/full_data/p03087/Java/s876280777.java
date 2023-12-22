import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int strNum = sc.nextInt();
    int quesNum = sc.nextInt();
    String str = sc.next();
    int first,last,count;
    String target = "";
    Pattern p = Pattern.compile("AC");
    for(int i=0;i<quesNum;i++){
      first = sc.nextInt()-1;
      last = sc.nextInt();
      target = str.substring(first,last);
      count = 0;
      Matcher m = p.matcher(target);
      while (m.find()) count++;
      
      System.out.println(count);
    }
  }
}