import java.util.Scanner;

class Haiku{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    
    System.out.println("整数値a：");
    int a=stdIn.nextInt();
    
    System.out.println("整数値b：");
    int b=stdIn.nextInt();
    
    System.out.println("整数値c：");
    int c=stdIn.nextInt();
    
    if(a==7){
      if(b==5&&c==5){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
    else if(a==5){
      if(b==5&&c==7){
        System.out.println("Yes");
      }
      else if(b==7&&c==5){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
    else{
      System.out.println("Yes");
    }
  }
}