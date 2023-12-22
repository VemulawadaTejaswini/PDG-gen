import java.util.Scanner;

 public class Main {

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
       String C=sc.nextLine();
       String alp="abcdefghijklmnopqrstuvwxyz";
       int X=alp.indexOf(C);

      System.out.println(alp.charAt(X+1));

    }
  }