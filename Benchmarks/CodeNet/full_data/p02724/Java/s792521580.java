import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int in=scan.nextInt();
    int price=0;
    price+=in/500*1000;
    in%=500;
    price+=in/5*5;
    System.out.println(price);
  }
}