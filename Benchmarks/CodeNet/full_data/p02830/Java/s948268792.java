import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    String a=scan.next();
    String b=scan.next();
    String[] a1=new String[num];
    String[] b1=new String[num];
    a1=a.split("");
    b1=b.split("");
    for(int x=0; x<num; x++){
      System.out.print(a1[x]+b1[x]);
    }
  }
}