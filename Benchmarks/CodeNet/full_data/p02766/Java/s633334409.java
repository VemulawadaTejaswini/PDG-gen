import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    System.out.print((int)(Math.ceil(Math.log(n+1)/Math.log(k))));
  }
}
