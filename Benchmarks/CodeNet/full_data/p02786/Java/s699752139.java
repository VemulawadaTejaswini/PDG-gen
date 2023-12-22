import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
long h=scan.nextLong();
  
int a=(int)(Math.log((double)h)/Math.log(2.0));
int b=(int)Math.pow(2.0,(double)a);
  
System.out.println(b-1);
  
}
}