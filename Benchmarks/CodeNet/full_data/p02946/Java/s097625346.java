import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    for(int x=b-a+1; x<b+a; x++){
      System.out.print(x+" ");
    }
  }
}