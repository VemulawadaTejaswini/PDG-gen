import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String answer = sc.next();
    StringBuilder sb = new StringBuilder();
    sb.append(answer);
    char tmp = sb.charAt(k-1);
    if(tmp=='A'){
      sb.setCharAt(k-1,'a');
    }else if(tmp=='B'){
      sb.setCharAt(k-1,'b');
    }else{
      sb.setCharAt(k-1,'c');
    }
    answer = sb.toString();
 //   System.out.print()
//    if(answer[n-1]=="A"){
//      answer[n-1]="a";
//    }else if(answer[n-1]=="B"){
//      answer[n-1]="b";
//    }else{
//      answer[n-1]="c";
//    }
    System.out.println(answer);
  }
}