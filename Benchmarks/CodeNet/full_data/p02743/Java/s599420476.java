import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
double A=(double)a;
double B=(double)b;  
double C=(double)c;  
  
if(Math.sqrt(A)+Math.sqrt(B)<Math.sqrt(C)){
System.out.println("Yes");
}else{
System.out.println("No");  
}
  
  
}
}