import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    int N=scan.nextInt();
    String S=scan.nextLine();
    String[] abc=S.split("ABC",-1);
    
    int i=abc.length;
    int ans=N-i;
    int finalans=ans/3;
    
    System.out.println(finalans);
  }
}