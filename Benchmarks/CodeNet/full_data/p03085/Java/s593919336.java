import java.util.Scanner;

public class Main{
  public static void main(String[]args){
   Scanner scan=new Scanner(System.in);
    String b=scan.next();
    char[]ss=b.toCharArray();
   switch(ss){
   case 'A':
    System.out.println('T');
    break;
   case 'T':
    System.out.println('A');
    break; 
   case 'G':
    System.out.println('C');
    break;
   case 'C':
    System.out.println('G');
    break; 
    }
}
}
  