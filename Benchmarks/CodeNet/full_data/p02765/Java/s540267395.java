import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    
    if(n < 10){
      System.out.println(100*(100-n)+r);
    }else{
      System.out.println(r);
    }
  }
}
