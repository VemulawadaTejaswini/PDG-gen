import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
String a=scan.next();
String [] b=a.split("");
int i=b.length;
System.out.println(b[0]+""+(i-2)+""+b[i-1]);
}
}