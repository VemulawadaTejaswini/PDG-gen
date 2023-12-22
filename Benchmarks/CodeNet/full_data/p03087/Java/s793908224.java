import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int strNum = sc.nextInt();
    int quesNum = sc.nextInt();
    String str = sc.next();
    int first,last;
    String target = "";
    for(int i=0;i<quesNum;i++){
      first = sc.nextInt()-1;
      last = sc.nextInt();
      target = str.substring(first,last);
      System.out.println(target.split("AC",-1).length-1);
    }
  }
}