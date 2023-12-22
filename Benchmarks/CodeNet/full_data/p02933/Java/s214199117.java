import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    String s = sc.next();
    
    judge(a,s);
  }
    
  public static void judge(int number,String cha){
    if(number>=3200){
      System.out.println(cha);
    }else{
      System.out.println("red");
    }
  }
}